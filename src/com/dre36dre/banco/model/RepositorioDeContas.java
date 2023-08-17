package com.dre36dre.banco.model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class RepositorioDeContas {

	public void salva(List<Conta> contas) throws FileNotFoundException {
		PrintStream stream= new PrintStream("contas.txt");
		for(Conta conta : contas) {
			stream.println(conta.getTipo() + "," +conta.getNumero() + ","
		+ conta.getAgencia() + "," + conta.getTitular()	+ ","
		+ conta.getSaldo());
		}
		stream.close();
	}
	
	
}
