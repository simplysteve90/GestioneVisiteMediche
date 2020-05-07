package it.dstech.servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.service.GestioneDatabase;

@WebServlet(name = "annullaDisponibilita", urlPatterns = { "/annullaDisponibilita" })
public class AnnullaDisponibilita extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Devi prima accedere");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestioneDatabase gestioneDB = new GestioneDatabase(
                (EntityManagerFactory) getServletContext().getAttribute("emf"));
		gestioneDB.rimuoviDisponibilita(Integer.parseInt(req.getParameter("idDisp")));
		req.getRequestDispatcher("annullaDisponibilita.jsp").forward(req, resp);
	}
}
