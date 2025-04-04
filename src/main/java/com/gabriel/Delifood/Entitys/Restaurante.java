package com.gabriel.Delifood.Entitys;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Nome;
	@Column (name="Taxa_frete")
	private BigDecimal TaxaFrete;
	
	//Construtores
	public Restaurante() {
		
	}
	
	public Restaurante(Long id,String nome, BigDecimal taxaFrete) {
		this.Id = id;
		this.Nome = nome;
		this.TaxaFrete = taxaFrete;
		
	}
	
	//Metodos Getters e Setters

	public Long getId() {
		return Id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public BigDecimal getTaxaFrete() {
		return TaxaFrete;
	}

	public void setTaxaFrete(BigDecimal taxaFrete) {
		TaxaFrete = taxaFrete;
	}
	
}
