package com.dre36dre.banco.model;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente>  {

	public int CompareTo(ContaCorrente outra) {
		if(this.saldo < outra.saldo) {
			return -1;
		}
		
		if(this.saldo > outra.saldo) {
			return 1;
		}
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getTipo() {
		return "Conta corrente"; 
	}
	@Override
	public void sacar(double valor) {
		if(valor <0 ) {
			throw new IllegalArgumentException("você tentou sacar um valor negativo");
		}
	if(this.saldo < valor) {
		throw new SaldoInsuficienteException(getTipo());
	}
		this.sacar(valor +0.10);
	
}
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	@Override
	public double getValorTributavel() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(ContaCorrente o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
