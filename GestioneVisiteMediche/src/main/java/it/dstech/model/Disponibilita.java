package it.dstech.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disponibilita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDisponibilita;
	private String data;
	private LocalTime oraInizio;
	private LocalTime oraFine;
	@Column(columnDefinition = "boolean default false")
	private boolean prenotato;

	public Disponibilita() {
	}

	public boolean isPrenotato() {
		return prenotato;
	}

	public void setPrenotato(boolean prenotato) {
		this.prenotato = prenotato;
	}

	public long getIdDisponibilita() {
		return idDisponibilita;
	}

	public void setIdDisponibilita(long idDisponibilita) {
		this.idDisponibilita = idDisponibilita;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

//	public String getOraInizio() {
//		return oraInizio;
//	}
//
//	public void setOraInizio(String oraInizio) {
//		this.oraInizio = oraInizio;
//	}
//
//	public String getOraFine() {
//		return oraFine;
//	}
//
//	public void setOraFine(String oraFine) {
//		this.oraFine = oraFine;
	

	

	public LocalTime getOraInizio() {
		return oraInizio;
	}

	public void setOraInizio(LocalTime oraInizio) {
		this.oraInizio = oraInizio;
	}

	public LocalTime getOraFine() {
		return oraFine;
	}

	public void setOraFine(LocalTime oraFine) {
		this.oraFine = oraFine;
	}

}
