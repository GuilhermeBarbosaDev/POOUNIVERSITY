package com.grupo.gestaoAcad;

import java.io.InputStream;

public class Funcionario extends Pessoa {
	private int numeroRegistro;
	private String cargo;
	public Funcionario(String nome, String cpf, String email, String telefone, int numeroRegistro, String cargo) {
		super(nome, cpf, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.cargo = cargo;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
