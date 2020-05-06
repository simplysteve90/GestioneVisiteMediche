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

@WebServlet(name = "controlloAzione", urlPatterns = { "/paziente/controlloAzione", "/medico/controlloAzione", "/controlloAzione" })
public class Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
                (EntityManagerFactory) getServletContext().getAttribute("emf"));
		HttpSession sessione = req.getSession();
		Utente utente = (Utente)sessione.getAttribute("Utente");
		int azione = Integer.parseInt(req.getParameter("azione"));
		switch (azione) {
		case 1:
			
			break;

		default:
			break;
		}
	}
}