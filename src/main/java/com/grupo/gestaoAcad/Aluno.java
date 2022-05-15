package com.grupo.gestaoAcad;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	public Aluno(String nome, String cpf, String email, String telefone, int matricula, String curso) {
		super(nome, cpf, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
