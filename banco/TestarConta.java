package banco;

public class TestarConta {
	public static void main(String[] args) {

		conta c1;
		c1 = new conta();
		c1.NomeTitular = "Hugo";
		c1.Agencia = "1001-X";
		c1.numeroConta = 302010;
		c1.saldo = 200;

		conta c2;
		c2 = new conta();
		c2.NomeTitular = "Danilo";
		c2.Agencia = "1002-X";
		c2.numeroConta = 302011;
		c2.saldo = 199;



		if ( c1.saldo == c2.saldo) {
			System.out.println(" As contas não possuem saldos iguais");

			System.out.println("CONTA 01");

			System.out.println("Titular:  " +c1.NomeTitular);
			System.out.println("Ag:  " +c1.Agencia);
			System.out.println("C. C: " + c1.numeroConta);
			System.out.println("Saldo Disponivel: " + c1.saldo);

			System.out.println("CONTA 02");

			System.out.println("Titular:  " +c2.NomeTitular);
			System.out.println("Ag:  " +c2.Agencia);
			System.out.println("C. C: " + c2.numeroConta);
			System.out.println("Saldo Disponivel: " + c2.saldo);


		} else {
			System.out.println(" As contas possuem saldos diferentes");

			System.out.println("CONTA 01");

			System.out.println("Titular:  " +c1.NomeTitular);
			System.out.println("Ag:  " +c1.Agencia);
			System.out.println("C. C: " + c1.numeroConta);
			System.out.println("Saldo Disponivel: " + c1.saldo);

			System.out.println("CONTA 02");

			System.out.println("Titular:  " +c2.NomeTitular);
			System.out.println("Ag:  " +c2.Agencia);
			System.out.println("C. C: " + c2.numeroConta);
			System.out.println("Saldo Disponivel: " + c2.saldo);
		}




	}
}
