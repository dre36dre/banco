package com.dre36dre.banco.contas;

import com.dre36dre.banco.model.Evento;
import com.dre36dre.banco.model.SeguroDeVida;

public class ManipuladorDeSeguroDeVida {
	
	private SeguroDeVida seguroDeVida;
	
	
	public void criaSeguro(Evento evento) {
		this.seguroDeVida= new SeguroDeVida();
		this.seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
		this.seguroDeVida.setTitular(evento.getString("titular"));
		this.seguroDeVida.setValor(evento.getDouble("valor"));
	}
}
