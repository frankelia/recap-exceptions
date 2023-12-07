package org.generation.exception;

import java.util.List;

public class Studente {
	private String nome;
	
	public Studente(String nome) throws Exception {
		this.nome = nome;
		
		if (nome == null || nome.isBlank())	{
			throw new Exception("Nome non valido");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws Exception {
		if (nome == null || nome.isBlank())	{
			throw new Exception("Nome non valido");
		}

		this.nome = nome;
	}
}
