package it.dstech.servlet;

import java.io.IOException;
import java.time.LocalTime;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.model.Disponibilita;
import it.dstech.service.GestioneDatabase;

@WebServlet(name = "aggiungiDisponibilita", urlPatterns = { "/medico/aggiungiDisponibilita" })
public class AggiungiDisponibilita extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi prima accedere");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		Disponibilita d = new Disponibilita();

		d.setData(req.getParameter("data"));
		int lassoDiTempo = Integer.parseInt(req.getParameter("oraFine"))
				- Integer.parseInt(req.getParameter("oraInizio"));
		for (int i = 0; i <= lassoDiTempo; i++) {
			d.setOraInizio(LocalTime.of(Integer.parseInt(req.getParameter("oraInizio")) +i, 0));
			d.setOraFine(LocalTime.of(Integer.parseInt(req.getParameter("oraInizio"))+ i + 1, 0));
			if(gestioneDB.controlloDisponibilita(d)) {
				gestioneDB.aggiungiDisponibilita(d);
				

		}
		}
		req.setAttribute("messaggio", "Hai aggiunto delle disponibilità, controlla nell'agenda per verificare.");
		req.getRequestDispatcher("menuMedico.jsp").forward(req, resp);
	}
}
