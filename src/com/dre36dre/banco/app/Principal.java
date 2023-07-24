package com.dre36dre.banco.app;

import com.dre36dre.banco.model.Conta;
import com.dre36dre.banco.model.ContaEspecial;
import com.dre36dre.banco.model.ContaInvestimento;
import com.dre36dre.banco.model.Pessoa;

public class Principal {
public static void main(String[] args) {
	Pessoa titular1= new Pessoa();
	titular1.setNome("Maria Luiza");
	titular1.setDocumento("123456789");
	
	ContaInvestimento nossaConta=new ContaInvestimento(titular1,258,159);
	nossaConta.depositar(15000);
	nossaConta.sacar(1000);
	nossaConta.creditarRendimento(0.8);
	
	ContaEspecial suaConta=new ContaEspecial(titular1, 0, 0, 1000);
	
	
	Pessoa titular2= new Pessoa();
	titular2.setNome("Victor Hugo");
	titular2.setDocumento("345678910");
	
	
	
	Conta minhaConta=new Conta(titular1,123,321);

	
	minhaConta.depositar(30000);
	minhaConta.sacar(2000);
	
	
//	Conta suaConta=new Conta(titular2, 623,687);
	

	
	suaConta.depositar(20000);
	suaConta.sacar(20500);
	
	
	System.out.println("Titular: "+nossaConta.getTitular().getNome());
	System.out.println("Saldo: "+ nossaConta.getSaldo());
	System.out.println("Agencia: "+nossaConta.getAgencia());
	System.out.println("============================================");
//	System.out.println("Titular: "+suaConta.getTitular().getNome());
	System.out.println("Saldo: "+ suaConta.getSaldo());
//	System.out.println("Agencia: "+suaConta.getAgencia());
	
	}
}


