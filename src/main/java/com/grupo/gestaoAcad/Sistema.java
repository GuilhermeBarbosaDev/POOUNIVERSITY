package com.grupo.gestaoAcad;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Aluno> listAlunos = new ArrayList<Aluno>();
	private ArrayList<Funcionario> listFuncionarios = new ArrayList<Funcionario>();
	private ArrayList<Processo> listProcessos = new ArrayList<Processo>();
	private ArrayList<Setor> listSetores = new ArrayList<Setor>();
	private ArrayList<Historico> listHistoricos = new ArrayList<Historico>();
	
	public Sistema() {
		
	}
	
	public ArrayList<Aluno> getListAlunos() {
		return listAlunos;
	}
	public void setListAlunos(ArrayList<Aluno> listAlunos) {
		this.listAlunos = listAlunos;
	}
	public ArrayList<Funcionario> getListFuncionarios() {
		return listFuncionarios;
	}
	public void setListFuncionarios(ArrayList<Funcionario> listFuncionarios) {
		this.listFuncionarios = listFuncionarios;
	}
	public ArrayList<Processo> getListProcessos() {
		return listProcessos;
	}
	public void setListProcessos(ArrayList<Processo> listProcessos) {
		this.listProcessos = listProcessos;
	}
	public ArrayList<Setor> getListSetores() {
		return listSetores;
	}
	public void setListSetores(ArrayList<Setor> listSetores) {
		this.listSetores = listSetores;
	}
	public ArrayList<Historico> getListHistoricos() {
		return listHistoricos;
	}
	public void setListHistoricos(ArrayList<Historico> listHistoricos) {
		this.listHistoricos = listHistoricos;
	}
	public void adicionaAluno(Aluno aluno) {
		this.listAlunos.add(aluno);
	}
	public void adicionaFuncionario(Funcionario funcionario) {
		this.listFuncionarios.add(funcionario);
	}
	public void adicionaProcesso(Processo processo) {
		this.listProcessos.add(processo);
	}
	public void adicionaSetor(Setor setor) {
		this.listSetores.add(setor);
	}
	public void adicionaHistorico(Historico historico) {
		this.listHistoricos.add(historico);
	}
	
}
