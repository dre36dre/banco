package com.dre36dre.banco.model;

public class ControleDeBonificacoes {

	public double totalDeBonificacoes=0;
	
	public void registra(Funcionario f) {
		System.out.println("Adicionando bonificacão do funcionario: " + f);
		this.totalDeBonificacoes +=f.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
	
	
}
