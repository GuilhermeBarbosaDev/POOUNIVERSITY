package com.grupo.gestaoAcad;

import java.util.Date;

public class Processo {
	private int numero;
	private String finalidade;
	private String descricao;
	private Date dataEntrada;
	private Setor setorDestino;
	public Processo(int numero, String finalidade, String descricao, Date dataEntrada, Setor setorDestino) {
		this.numero = numero;
		this.finalidade = finalidade;
		this.descricao = descricao;
		this.dataEntrada = dataEntrada;
		this.setSetorDestino(setorDestino);
		}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Setor getSetorDestino() {
		return setorDestino;
	}
	public void setSetorDestino(Setor setorDestino) {
		this.setorDestino = setorDestino;
	}
	
}
