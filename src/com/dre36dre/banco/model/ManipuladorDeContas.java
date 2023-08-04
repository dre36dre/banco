package com.dre36dre.banco.model;

public class ManipuladorDeContas extends Conta {
	
	Conta conta=new Conta() {
		
		@Override
		public String getTipo() {
			// TODO Auto-generated method stub
			return null;
		}
	}; {
	};
	
public void criaConta(Evento evento) {
	String tipo= evento.getSelecionadoNoRadio();
	if(tipo.equals("Conta Corrente")) {
		this.conta=new ContaCorrente();
	}else if (tipo.equals("Conta Poupança")) {
		this.conta= new ContaPoupanca();
	}
	
	
//	this.conta= new Conta();
	this.conta.setAgencia(evento.getString("agencia"));
	this.conta.setNumero(evento.getInt("numero"));
	this.conta.setTitular(evento.getString("titular");
}
	
	@Override
	public void transfere(double valor, Conta conta) {
		Conta destino=(Conta) evento.getSelecionaNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
}
