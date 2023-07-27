package com.dre36dre.banco.contas;

import com.dre36dre.banco.model.Evento;
import com.dre36dre.banco.model.Tributavel;

public class ManipuladorDeTributaveis {
	private double total;
	
	public void  calculaImpostos(Evento evento) {
	total=0;
	int tamanho=evento.getTamanhoDaLista("listaTributaveis");
	for(int i=0;i < tamanho; i++) {
		Tributavel t=evento.getTributavel("listaTributavel",i);
		total +=t.getValorTributavel();
	}
	}
	public double getTotal() {
		return total;
	}
	
}
