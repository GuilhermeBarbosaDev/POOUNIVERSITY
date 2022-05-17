package com.grupo.gestaoAcad;

public class Funcionario extends Pessoa {
	private String numeroRegistro;
	private String cargo;
	
	public Funcionario(String nome, String cpf, String email, String telefone, String numeroRegistro, String cargo) {
		super(nome, cpf, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.cargo = cargo;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [numeroRegistro=" + numeroRegistro + ", cargo=" + cargo + ", nome=" + super.getNome() + "]";
	}


	
	
	
	
}
