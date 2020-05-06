package it.dstech.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Utente {
	@Id
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	@Lob
	@Column(columnDefinition = "LONGBLOB NOT NULL")
	private String image;
	@Column(columnDefinition = "VARCHAR(255) default 'paziente'")
	private String ruolo;
	@Column(columnDefinition = "boolean default false")
	private boolean active;
	@OneToMany
	private List<Appuntamento> appuntamenti;
	
	
	public Utente() {
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Appuntamento> getAppuntamenti() {
		return appuntamenti;
	}

	public void setAppuntamento(List<Appuntamento> appuntamenti) {
		this.appuntamenti = appuntamenti;
	}

	@Override
	public String toString() {
		return "Utente [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", password=" + password + ", image=" + image + ", ruolo=" + ruolo + ", active=" + active
				+ ", appuntamenti=" + appuntamenti + "]";
	}

}
