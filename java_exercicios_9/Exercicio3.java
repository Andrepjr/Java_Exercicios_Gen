package java_exercicios_9;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		String nome;
		int idade;
		boolean primeiraDoacao = true;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();

		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();

		System.out.println("É a sua primeira doação ?");
		primeiraDoacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apto para doar sangue!");

		}

		else if (idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto para doar sangue!");

		} else {
			System.out.println(nome + " não está apto para doar sangue.");
		}

	}

}
