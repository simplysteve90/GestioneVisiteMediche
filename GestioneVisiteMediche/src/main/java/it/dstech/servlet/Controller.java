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

@WebServlet(name = "controlloAzione", urlPatterns = { "/paziente/controlloAzione", "/medico/controlloAzione",
		"/controlloAzione" })
public class Controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		HttpSession sessione = req.getSession();
		Utente utente = (Utente) sessione.getAttribute("Utente");
		int azione = Integer.parseInt(req.getParameter("azione"));
		switch (azione) {
		case 1:
			req.setAttribute("listaDisponibilita", gestioneDB.mostraListaDisponibilita(req.getParameter("data")));
			req.getRequestDispatcher("/medico/gestioneAppuntamenti.jsp").forward(req, resp);
			break;
		case 2:
			req.setAttribute("messaggio", "Devi prima accedere");
			req.getRequestDispatcher("/medico/aggiungiPatologia.jsp").forward(req, resp);
			break;
		case 3:
			req.setAttribute("listaPatologie", gestioneDB.stampaPatologie());
			req.getRequestDispatcher("/medico/rimuoviPatologia.jsp").forward(req, resp);
			break;
		case 4:
			req.getRequestDispatcher("/medico/aggiungiDisponibilita.jsp").forward(req, resp);
			break;
		case 5:
			req.setAttribute("messaggio", "Devi prima accedere");
			req.getRequestDispatcher("/medico/annullaDisponibilita.jsp").forward(req, resp);
			break;
		case 6:
			// completato
			req.setAttribute("stampaPatologia", gestioneDB.stampaPatologie());
			req.setAttribute("listaDisponibilita", gestioneDB.mostraListaDisponibilita(req.getParameter("data")));
			req.getRequestDispatcher("aggiungiAppuntamento.jsp").forward(req, resp);
			break;
		case 7:
			// completato
			req.setAttribute("listaAppuntamenti", gestioneDB.mostraListaAppuntamenti());
			req.getRequestDispatcher("annullaAppuntamento.jsp").forward(req, resp);
			break;
		case 8:
			req.setAttribute("storicoApp", gestioneDB.mostraStoricoAppuntamenti());
			req.getRequestDispatcher("storicoApp.jsp").forward(req, resp);
			break;
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
