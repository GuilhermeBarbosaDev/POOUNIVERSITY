package com.grupo.gestaoAcad;

import java.util.Date;

public class Historico {
	
	private Date dataEncaminhamento;
	/*private String orgao;
	private String parecer;
	*/
	private boolean processoConcluido;
	public Historico(Date dataEncaminhamento, boolean processoConcluido) {
		this.dataEncaminhamento = dataEncaminhamento;
		this.processoConcluido = processoConcluido; //retornar Em analise ou concluido
	}
	
	public Date getDataEncaminhamento() {
		return dataEncaminhamento;
	}
	public void setDataEncaminhamento(Date dataEncaminhamento) {
		this.dataEncaminhamento = dataEncaminhamento;
	}
	public boolean isProcessoConcluido() {
		return processoConcluido;
	}
	public void setProcessoConcluido(boolean processoConcluido) {
		this.processoConcluido = processoConcluido;
	}
	
}
