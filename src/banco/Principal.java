package banco;

public class Principal {
public static void main(String[] args) {
	Pessoa titular1= new Pessoa();
	titular1.nome="Maria Luiza";
	titular1.documento="123456789";
	
	Pessoa titular2= new Pessoa();
	titular2.nome="Victor Hugo";
	titular2 .documento="345678910";
	
	
	
	Conta minhaConta=new Conta();
	minhaConta.titular=titular1;
	minhaConta.agencia=123;
	minhaConta.numero=987;
	minhaConta.saldo=10_000;
	
	Conta suaConta=new Conta();
	suaConta.titular=titular2;
	suaConta.agencia=623;
	suaConta.numero=687;
	suaConta.saldo=30_000;
	
	
	
	System.out.println("Titular: "+minhaConta.titular.nome);
	System.out.println("Saldo: "+ minhaConta.saldo);
	System.out.println("Agencia: "+minhaConta.agencia);
	System.out.println("============================================");
	System.out.println("Titular: "+suaConta.titular.nome);
	System.out.println("Saldo: "+ suaConta.saldo);
	System.out.println("Agencia: "+suaConta.agencia);
	
	}
}


