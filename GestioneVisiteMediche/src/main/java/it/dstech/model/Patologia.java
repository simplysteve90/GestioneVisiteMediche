package it.dstech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patologia {
	@Id
	private String nome;

	
public Patologia() {
	
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


@Override
public String toString() {
	return "Patologia [nome=" + nome + "]";
}
}
