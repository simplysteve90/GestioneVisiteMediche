package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.model.Utente;
import it.dstech.service.GestioneDatabase;

@WebServlet(urlPatterns = { "/validazione" })
public class Validazione extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		Utente utente = gestioneDB.validaUtente(req.getParameter("codFiscale"));
		req.setAttribute("messaggio", "L'utente " + utente.getCodiceFiscale() + " è stato validato");
		req.getRequestDispatcher("login.jsp").forward(req, resp);

	}

}
