package com.dre36dre.banco.model;

public class Gerente  extends Funcionario implements Autenticavel {
private int senha;
private int numeroDeFuncionariosGerenciados;

@Override
public void getBonificacao () {
	return super.getBonificacao() * 1.4 +1000;
}

public boolean autentica(int senha) {
	if(this.senha==senha) {
		System.out.println("Acesso permitido");
		return true;
	}else {
		System.out.println("Acesso negado");
	return false;
	}
}

public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public int getNumeroDeFuncionariosGerenciados() {
	return numeroDeFuncionariosGerenciados;
}

public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
	this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
}
	
	
}
