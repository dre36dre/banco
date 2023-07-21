package banco;

public class Principal {
public static void main(String[] args) {
	Conta minhaConta=new Conta();
	minhaConta.titular="anderson";
	minhaConta.agencia=123;
	minhaConta.numero=987;
	minhaConta.saldo=10_000;
	
	System.out.println("Titular: "+minhaConta.titular);
	System.out.println("Saldo: "+ minhaConta.saldo);
	System.out.println("Agencia: "+minhaConta.agencia);
}
}
