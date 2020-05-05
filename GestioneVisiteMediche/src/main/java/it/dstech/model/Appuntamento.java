package it.dstech.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appuntamento {
	@Id
	private long id;
	private String data;
	private String ora;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOra() {
		return ora;
	}

	public void setOra(String ora) {
		this.ora = ora;
	}

	public Patologia getPatologia() {
		return patologia;
	}

	public void setPatologia(Patologia patologia) {
		this.patologia = patologia;
	}

	@Override
	public String toString() {
		return "Appuntamento [id=" + id + ", data=" + data + ", ora=" + ora + ", patologia=" + patologia + "]";
	}
	
	

}
