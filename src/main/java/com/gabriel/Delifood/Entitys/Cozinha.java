package com.gabriel.Delifood.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cozinha {
	@Id
	private Long Id;
	private String Nome;

	//Construtores
	
	public Cozinha() {

	}

	public Cozinha(Long id, String nome) {
		this.Id = id;
		this.Nome = nome;

	}
	
	//Metodos Getters e Settes

	public Long getId() {
		return Id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

}