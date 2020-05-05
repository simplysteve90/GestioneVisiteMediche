package it.dstech.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import javax.mail.MessagingException;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import it.dstech.model.Utente;
import it.dstech.service.GestioneDatabase;
import it.dstech.utility.Crypto;
import it.dstech.utility.EmailUtility;


@MultipartConfig
@WebServlet(name = "registrazione", urlPatterns = { "/registrazione" })

public class Registrazione extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "Utente già esistente");
        req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        try {
			GestioneDatabase gestioneDB = new GestioneDatabase(
			        (EntityManagerFactory) getServletContext().getAttribute("emf"));
			Utente utente = new Utente();
			Part image = req.getPart("image");
			InputStream f = image.getInputStream();
			byte[] imageBytes = new byte[(int) image.getSize()];
			f.read(imageBytes, 0, imageBytes.length);
			f.close();
			String imageStr = Base64.getEncoder().encodeToString(imageBytes);
			utente.setCodiceFiscale(req.getParameter("codFiscale"));
			utente.setPassword(Crypto.encrypt(req.getParameter("password")));
			utente.setNome(req.getParameter("nome"));
			utente.setCognome(req.getParameter("cognome"));
			utente.setEmail(req.getParameter("email"));
			utente.setImage(imageStr);
			utente.setRuolo(req.getParameter("ruolo"));
			if(gestioneDB.controlloUtente(utente)) {
				req.setAttribute("messaggio", "Utente già esistente");
			    req.getRequestDispatcher("login.jsp").forward(req, resp);
			} else {
				gestioneDB.aggiungiUtente(utente);
				EmailUtility.sendEmail(utente.getEmail(), "Conferma Mail",
			            generaLinkValidazioneUtente(utente));
				req.setAttribute("messaggio", "Controlla l'email per la validazione");
			    req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		} catch (IOException | ServletException | MessagingException e) {
			e.printStackTrace();
		}
	}
	private String generaLinkValidazioneUtente(Utente utente) {
        String validationPath = "http://localhost:8080/battleground-tracker/validazione?utente=";
        return "Per attivare la mail clicca su questo link: " + validationPath + utente.getCodiceFiscale();
    }
}
