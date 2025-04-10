package ex;

import java.util.Scanner;

public class banco {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = ff.nextLine();

		System.out.println("Digite o numero da sua conta: ");
		int conta = ff.nextInt();

		System.out.println("Vai fazer um depósito (y - 1/n- 2)? ");
		int x = ff.nextInt();

		GET abrir = new GET(nome, conta);

		switch (x) {

		case 1:

			System.out.println("Digite o valor a ser depositado ");
			double deposito = ff.nextDouble();
			abrir.setDeposito(deposito);
			break;

		case 2:

			deposito = 0;
			break;
		}

		System.out.printf("PREÇO ATUALIZADO " + abrir.getInf());
		System.out.println();

		System.out.println("Digite o valor a ser depositado ");
		double dep = ff.nextDouble();
		abrir.setDeposito(dep);
		System.out.println();
		

		System.out.printf("PREÇO ATUALIZADO " + abrir.getInf());
		System.out.println();

		System.out.println("Digite o valor a ser retirado ");
		double saq = ff.nextDouble();
		abrir.setSaque(saq);
		System.out.println();

		System.out.printf("PREÇO ATUALIZADO " + abrir.getInf());

	}

}
