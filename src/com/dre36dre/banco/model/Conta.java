package com.dre36dre.banco.model;

import java.util.Objects;

public abstract class Conta {
	Pessoa titular;
private int agencia;
private double saldo ;
private int numero;
 
 Conta(){
	 
 }
 
 
 
 public Conta(Pessoa titular, int agencia, int numero){
	 Objects.requireNonNull(titular);
	 this.titular=titular;
	 this.agencia=agencia;
	 this.numero=numero;
 }
 
 public abstract void debitarTarifaMensal();
 
 public void depositar(double valor) {
	 saldo=saldo+valor;
 }
public  void sacar(double valor) {
	if(valor <=0) {
		throw new IllegalArgumentException("Valor menor que 0");
	}
	if(getSaldoDisponivel() - valor <0) {
		throw new IllegalArgumentException("Valor insuficiente");
	}
	saldo=saldo-valor;
}



public Pessoa getTitular() {
	return titular;
}



public void setTitular(Pessoa titular) {
	this.titular = titular;
}



public int getAgencia() {
	return agencia;
}

public double getSaldo() {
	return saldo;
}


public int getNumero() {
	return numero;
}

public double getSaldoDisponivel() {
	return getSaldo();
}

//void sacar(double valor, double taxaSaque) {
//	sacar(valor, taxaSaque);
//}



}
