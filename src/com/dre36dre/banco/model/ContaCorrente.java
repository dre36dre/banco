package com.dre36dre.banco.model;

public class ContaCorrente extends Conta implements Tributavel  {
	public String getTipo() {
		return "Conta corrente"; 
	}
	@Override
	public void sacar(double valor) {
		
		super.sacar(valor +0.10);
	}
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	
	
}
