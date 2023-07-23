package banco;

import java.util.Objects;

public class Conta {
	Pessoa titular;
int agencia;
 double saldo ;
 int numero;
 
 Conta(){
	 
 }
 
 
 
 Conta(Pessoa titular, int agencia, int numero){
	 Objects.requireNonNull(titular);
	 this.titular=titular;
	 this.agencia=agencia;
	 this.numero=numero;
 }
 
 
 
 void depositar(double valor) {
	 saldo=saldo+valor;
 }
void sacar(double valor) {
	if(valor <=0) {
		throw new IllegalArgumentException("Valor menor que 0");
	}
	if(saldo- valor <0) {
		throw new IllegalArgumentException("Valor insuficiente");
	}
	saldo=saldo-valor;
}

//void sacar(double valor, double taxaSaque) {
//	sacar(valor, taxaSaque);
//}



}
