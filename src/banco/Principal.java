package banco;

public class Principal {
public static void main(String[] args) {
	Pessoa titular1= new Pessoa();
	titular1.setNome("Maria Luiza");
	titular1.setDocumento("123456789");
	
	Pessoa titular2= new Pessoa();
	titular2.setNome("Victor Hugo");
	titular2.setDocumento("345678910");
	
	
	
	Conta minhaConta=new Conta(titular1,123,321);

	
	minhaConta.depositar(30000);
	minhaConta.sacar(2000);
	
	
	Conta suaConta=new Conta(titular2, 623,687);
	

	
	suaConta.depositar(200000);
	suaConta.sacar(1000);
	
	
	System.out.println("Titular: "+minhaConta.getTitular().getNome());
	System.out.println("Saldo: "+ minhaConta.getSaldo());
	System.out.println("Agencia: "+minhaConta.getAgencia());
	System.out.println("============================================");
	System.out.println("Titular: "+suaConta.getTitular().getNome());
	System.out.println("Saldo: "+ suaConta.getSaldo());
	System.out.println("Agencia: "+suaConta.getAgencia());
	
	}
}


