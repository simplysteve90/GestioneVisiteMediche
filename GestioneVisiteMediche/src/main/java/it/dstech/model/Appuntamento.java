package it.dstech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appuntamento {
	@Id
	private long id;
	private String data;
	private String ora;
	private Patologia patologia;
	
		

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
