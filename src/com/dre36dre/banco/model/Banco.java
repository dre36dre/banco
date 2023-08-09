package com.dre36dre.banco.model;

public class Banco {
private String nome;
private int numero;
private Conta[] contas;
public Banco(String nome, int numero, Conta[] contas) {
	super();
	this.nome = nome;
	this.numero = numero;
	this.contas = new ContaCorrente[10];
}
public String getNome() {
	return nome;
}
public int getNumero() {
	return numero;
}
public Conta[] getContas() {
	return contas;
}

public void adiciona(Conta c) {
	for(int i=0;i < this.contas.length;i++) {
		if(this.contas[i]==null) {
			this.contas[i];
		}
	}
}


}
