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
			req.setAttribute("listaDisponibilita", gestioneDB.mostraListaDisponibilita(req.getParameter("data")));
	        req.getRequestDispatcher("agenda.jsp").forward(req, resp);
			break;
		case 2:
			req.setAttribute("messaggio", "Devi prima accedere");
	        req.getRequestDispatcher("aggiungiPatologia.jsp").forward(req, resp);
			break;
		case 3:
			req.setAttribute("messaggio", "Devi prima accedere");
	        req.getRequestDispatcher("rimuoviPatologia.jsp").forward(req, resp);
			break;
		case 4:
			req.setAttribute("messaggio", "Devi prima accedere");
	        req.getRequestDispatcher("aggiungiDisp.jsp").forward(req, resp);
			break;
		case 5:
			req.setAttribute("messaggio", "Devi prima accedere");
	        req.getRequestDispatcher("rimuoviDisp.jsp").forward(req, resp);
			break;
		case 6:
			//case per aggiungere appuntamento
			req.setAttribute("listaDisponibilita", gestioneDB.mostraListaDisponibilita(req.getParameter("data")));
	        req.getRequestDispatcher("agenda.jsp").forward(req, resp);
			break;
		case 7:
			//case per rimuovere appuntamento
			req.setAttribute("listaAppuntamenti", gestioneDB.mostraListaAppuntamenti());
	        req.getRequestDispatcher("annullaAppuntamento.jsp").forward(req, resp);
			break;
		case 8:
			req.setAttribute("messaggio", "Devi prima accedere");
	        req.getRequestDispatcher("storicoApp.jsp").forward(req, resp);
			break;
		}
	}
}
