package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.dstech.model.Utente;
import it.dstech.service.GestioneDatabase;
import it.dstech.utility.Crypto;

@WebServlet(name = "login", urlPatterns = { "/login" })

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi prima accedere");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			GestioneDatabase gestioneDB = new GestioneDatabase(
					(EntityManagerFactory) getServletContext().getAttribute("emf"));
			Utente utente = new Utente();
			utente.setCodiceFiscale(req.getParameter("codFiscale"));
			utente.setPassword(Crypto.encrypt(req.getParameter("password")));

			if (!gestioneDB.controlloUtente(utente)) {
				req.setAttribute("messaggio", "Credenziali invalide");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			} else {
				utente = gestioneDB.trovaUtente(utente);
			}
			if (utente.isActive()) {
				if (utente.getRuolo().equals("paziente")) {
					HttpSession sessione = req.getSession();
					sessione.setAttribute("Utente", utente);
					req.getRequestDispatcher("paziente/menuPaziente.jsp").forward(req, resp);
				} else {
					HttpSession sessione = req.getSession();
					sessione.setAttribute("Utente", utente);
					req.getRequestDispatcher("medico/menuMedico.jsp").forward(req, resp);
				}
			} else {
				req.setAttribute("messaggio", "Utente non attivo, controllare l'email");
				req.getRequestDispatcher("login.jsp").forward(req, resp);

			}
		} catch (IOException | ServletException e) {
			e.printStackTrace();
			req.setAttribute("messaggio", "Errore d'accesso");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}
