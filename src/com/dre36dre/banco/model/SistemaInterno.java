package com.dre36dre.banco.model;

public class SistemaInterno {

	public void login(Autenticavel a) {
		int senha=1234;
		boolean ok= a.autentica(senha);
	}
	
	
}
