package com.grupo.gestaoAcad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processo {
	SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private int numero;
	private String finalidade;
	private String descricao;
	private String dataEntrada;
	private int setorDestino;
	private Boolean concluido;
	private Date data = new Date();
	
	public Processo(int numero, String finalidade, String descricao, int setorDestino) {
		this.numero = numero;
		this.finalidade = finalidade;
		this.descricao = descricao;
		this.dataEntrada = sdf1.format(data);
		this.setorDestino = setorDestino;
		this.concluido = false;
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
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public int getSetorDestino() {
		return setorDestino;
	}
	public void setSetorDestino(int setorDestino) {
		this.setorDestino = setorDestino;
	}	
	public Boolean estaConcluido() {
		return concluido;
	}
	public void setStatus(Boolean concluido) {
		this.concluido = concluido;
	}
	public String getStatus() {
		return this.concluido == true ? "Concluido" : "Em analise";
		
	}
	@Override
	public String toString() {
		return "\nNumero do Processo: " + numero 
				+ "\nFinalidade: " + finalidade 
				+ "\nDescricao: " + descricao 
				+ "\nData de Entrada: " + dataEntrada 
				+ "\nSetor Destino: " + setorDestino
				+ "\nStatus do processo:" + this.getStatus();
	}


	
	
}
