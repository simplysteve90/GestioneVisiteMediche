package it.dstech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appuntamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAppuntamento;
	@ManyToOne
	private Disponibilita disponibilita;
	@ManyToOne
	private Patologia patologia;
	@ManyToOne
	private Utente utente;
		

	public Appuntamento() {
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public long getIdAppuntamento() {
		return idAppuntamento;
	}

	public void setIdAppuntamento(long idAppuntamento) {
		this.idAppuntamento = idAppuntamento;
	}

	

	public Patologia getPatologia() {
		return patologia;
	}

	public void setPatologia(Patologia patologia) {
		this.patologia = patologia;
	}

	public Disponibilita getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(Disponibilita disponibilita) {
		this.disponibilita = disponibilita;
	}

	@Override
	public String toString() {
		return "Appuntamento [idAppuntamento=" + idAppuntamento + ", disponibilita=" + disponibilita + ", patologia="
				+ patologia + ", utente=" + utente + "]";
	}
	
	

	
	
	

}