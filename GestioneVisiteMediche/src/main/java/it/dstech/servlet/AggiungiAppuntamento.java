package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.dstech.model.Appuntamento;
import it.dstech.model.Disponibilita;
import it.dstech.model.Patologia;
import it.dstech.model.Utente;
import it.dstech.service.GestioneDatabase;

@WebServlet(name = "aggiungiAppuntamento", urlPatterns = { "/aggiungiAppuntamento" })
public class AggiungiAppuntamento extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi prima accedere");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
                (EntityManagerFactory) getServletContext().getAttribute("emf"));
		Appuntamento appuntamento = new Appuntamento();
		HttpSession sessione = req.getSession();
		Utente utente = (Utente)sessione.getAttribute("Utente");
		appuntamento.setDisponibilita((Disponibilita)req.getAttribute("disponibilita"));
		appuntamento.setPatologia((Patologia)req.getAttribute("patologia"));
		appuntamento.setUtente(utente);
		if(gestioneDB.controlloAppuntamento((Disponibilita)req.getAttribute("disponibilita"))) {
			gestioneDB.aggiungiAppuntamento(appuntamento, utente);
			req.setAttribute("messaggio", "Appuntamento prenotato");
			req.getRequestDispatcher("menuPaziente.jsp").forward(req, resp);
		} else {
			req.setAttribute("messaggio", "Non piu disponibile");
			req.getRequestDispatcher("menuPaziente.jsp").forward(req, resp);
		}
	}
}
