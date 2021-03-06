package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.model.Patologia;
import it.dstech.service.GestioneDatabase;

@WebServlet(name = "aggiungiPatologia", urlPatterns = { "/medico/aggiungiPatologia" })
public class AggiungiPatologia extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi prima accedere");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		GestioneDatabase gestioneDB = new GestioneDatabase(
				(EntityManagerFactory) getServletContext().getAttribute("emf"));
		Patologia patologia = new Patologia();
		patologia.setNome(req.getParameter("nomePatologia"));
		if (gestioneDB.controlloPatologia(patologia)) {
			gestioneDB.aggiungiPatologia(patologia);
			req.setAttribute("messaggio", "Patologia aggiunta");
			req.getRequestDispatcher("menuMedico.jsp").forward(req, resp);

		} else {
			req.setAttribute("messaggio", "Patologia gi� presente");
			req.getRequestDispatcher("menuMedico.jsp").forward(req, resp);
		}
	}
}
