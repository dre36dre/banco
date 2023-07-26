package com.dre36dre.banco.model;

public class ContaInvestimento  extends Conta{
 
	public ContaInvestimento(Pessoa titular, int agencia, int numero) {
		super(titular, agencia ,numero);
	}
	
	public void creditarRendimento(double percentualJuros) {
		double valorRendimentos=getSaldo() * percentualJuros /100;
		depositar(valorRendimentos);
	}
	@Override
	public void debitarTarifaMensal() {
		if(getSaldo() < 10000) {
		sacar(30);
	}
	
	}
	}
