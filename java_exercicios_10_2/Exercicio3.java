package java_exercicios_10_2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:

		
		
		
		
		int idade=0, cinquenta=0, vinte=0;
		Scanner leia = new Scanner(System.in);
		
		while (idade >= 0) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0) {
				vinte++;
			}
			if (idade >= 50) {
				cinquenta++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21: "+vinte);
		System.out.println("Total de pessoas maiores de cinquenta: "+cinquenta);
		
		
		
			
		}
		

	}


