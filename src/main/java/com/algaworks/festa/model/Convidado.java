package com.algaworks.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Convidado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	private String nome;
	
	private Integer acompanhantes;
	
	public Convidado() {
		
	}
	
	public Convidado(Long id, String nome, Integer acompanhantes) {
		this.id = id;
		this.nome = nome;
		this.acompanhantes = acompanhantes;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getAcompanhantes() {
		return acompanhantes;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQuantidadeAcompanhantes(Integer acompanhantes) {
		this.acompanhantes = acompanhantes;
	}
	
	
}
