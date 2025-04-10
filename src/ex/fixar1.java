package ex;
import java.util.Scanner;

public class fixar1 {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		
		System.out.println("DIGITE O VALOR DO DOLAR");
		double conversao = ff.nextDouble();
		System.out.println("DIGITE O VALOR QUE QUER RETIRAR");
		double valor = ff.nextDouble();
		
		double a = Fixar.val(valor, conversao);
		
		System.out.println(a);
		
	}

}

// o "FIXAR" é o método e o "val" é de onde ta puxando a conta, o que ta no parenteses é a referencia que ele esta utilizando para calcular
// e a variável "a" é a que está recebendo toda a operação e chamando tudo