package it.dstech.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import it.dstech.model.Appuntamento;
import it.dstech.model.Patologia;
import it.dstech.model.Utente;


public class GestioneDatabase {
	private EntityManager em;

	public GestioneDatabase(EntityManagerFactory emf) {
		this.em = emf.createEntityManager();
	}

	public Utente aggiungiUtente(Utente utente) {
		em.getTransaction().begin();
		em.persist(utente);
		em.getTransaction().commit();
		return utente;
	}

	public Utente validaUtente(String codiceFiscale) {
		Utente utente = em.find(Utente.class, codiceFiscale);
		utente.setActive(true);
		em.getTransaction().begin();
		em.persist(utente);
		em.getTransaction().commit();
		return utente;
	}

	public boolean controlloUtente(Utente utente) {
		Utente u = em.find(Utente.class, utente.getCodiceFiscale());
		if (u == null) {
			return false;
		}
		return true;
	}

	public Utente trovaUtente(Utente utente) {
		return em.find(Utente.class, utente.getCodiceFiscale());
	}

	public Patologia aggiungiPatologia(Patologia patologia) {
		em.getTransaction().begin();
		em.persist(patologia);
		em.getTransaction().commit();
		return patologia;
	}

	public boolean controlloPatologia(Patologia patologia) {
		Patologia p = em.find(Patologia.class, patologia.getNome());
		if (p == null) {
			return true;
		}
		return false;
	}
	
	public List<Patologia> stampaPatologia(){
		List<Patologia> lista = em.createQuery("SELECT p FROM Patologia p ORDER BY p.nome", Patologia.class).getResultList();
		return lista;
	}

	public Appuntamento aggiungiAppuntamento(Appuntamento appuntamento, Utente utente) {
		Utente u = em.find(Utente.class, utente.getCodiceFiscale());
		u.getAppuntamenti().add(appuntamento);
		em.getTransaction().begin();
		em.persist(u);
		em.persist(appuntamento);
		em.getTransaction().commit();
		return appuntamento;
	}

	public boolean controlloAppuntamento(Appuntamento appuntamento) {
		Query query = em.createQuery(
				"SELECT appuntamento FROM Appuntamento appuntamento WHERE appuntamento.data = ?1 and appuntamento.ora = ?2");
		query.setParameter(1, appuntamento.getData());
		query.setParameter(2, appuntamento.getOra());
		try {
			return false;
		} catch (NoResultException e) {
			return true;
		}

	}
}
