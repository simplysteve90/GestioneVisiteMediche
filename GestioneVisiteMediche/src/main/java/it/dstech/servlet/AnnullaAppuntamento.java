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

@WebServlet(name = "annullaAppuntamento", urlPatterns = { "/annullaAppuntamento" })
public class AnnullaAppuntamento extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi prima accedere");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		HttpSession sessione = req.getSession();
		Utente utente = (Utente) sessione.getAttribute("Utente");
		gestioneDB.rimuoviAppuntamento(Integer.parseInt(req.getParameter("idApp")));
		if (utente.getRuolo().equals("paziente")) {
			req.setAttribute("messaggio", "Appuntamento annullato con successo");
			req.getRequestDispatcher("menuPaziente.jsp").forward(req, resp);
		}
		req.setAttribute("messaggio", "Appuntamento annullato con successo");
		req.getRequestDispatcher("menuMedico.jsp").forward(req, resp);
	}
}
