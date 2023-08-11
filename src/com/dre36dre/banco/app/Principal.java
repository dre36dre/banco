package com.dre36dre.banco.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dre36dre.banco.model.CaixaEletronico;
import com.dre36dre.banco.model.Conta;
import com.dre36dre.banco.model.ContaCorrente;
import com.dre36dre.banco.model.ContaEspecial;
import com.dre36dre.banco.model.ContaInvestimento;
import com.dre36dre.banco.model.Gerente;
import com.dre36dre.banco.model.Pessoa;

public class Principal {
	public static void main(String[] args) {
		
		ContaCorrente c1=new ContaCorrente();
		c1.depositar(500);
		
		ContaCorrente c2=new ContaCorrente();
		c2.depositar(200);
		
		ContaCorrente c3=new ContaCorrente();
		c3.depositar(150);
		
		List<ContaCorrente> contas= new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		
		c1.depositar(10000);
		c2.depositar(3000);
		
		Map<String, ContaCorrente> mapaDeContas=new HashMap<>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		ContaCorrente contaDoDiretor=mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		
		Collections.sort(contas);
		
		System.out.println(contas);
		
//		Gerente gerente= new Gerente();
////		gerente.setNome("Pedro Miguel");		
//		gerente.setSenha(1234);
////		gerente.setSalario(5000);
//		
////		System.out.println("Nome funcionario: "+gerente.getNome());
////		System.out.println("Bonificação gerente"+gerente.getBonificacao());
//		
//		
//		
//		Pessoa titular1 = new Pessoa();
//		titular1.setNome("Maria Luiza");
//		titular1.setDocumento("123456789");
//
//		ContaInvestimento nossaConta = new ContaInvestimento(titular1, 258, 159);
//		nossaConta.depositar(15000);
//		nossaConta.sacar(1000);
//		nossaConta.creditarRendimento(0.8);
//
//		ContaEspecial suaConta = new ContaEspecial(titular1, 0, 0, 1000);
//		CaixaEletronico caixaEletronico = new CaixaEletronico();
//
//		caixaEletronico.imprimirSaldo(suaConta);
//		caixaEletronico.imprimirSaldo(nossaConta);
//
//		Pessoa titular2 = new Pessoa();
//		titular2.setNome("Victor Hugo");
//		titular2.setDocumento("345678910");
//
////	Conta minhaConta=new Conta(titular1,123,321);
//
//		Conta conta = suaConta;
////		conta.debitarTarifaMensal();
//
//		suaConta.depositar(30000);
//		suaConta.sacar(2000);
//
//		suaConta.debitarTarifaMensal();
//
//		suaConta.depositar(20000);
//		suaConta.sacar(20500);
//
//		System.out.println("Agencia: " + suaConta.getAgencia());

	}
}
