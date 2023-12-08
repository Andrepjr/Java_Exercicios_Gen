package java_exercicios_10_2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
		
		
				Scanner leia = new Scanner(System.in);
				
				int n, soma=0;
				
				do {
					System.out.println("Digite um número inteiro: ");
					n = leia.nextInt();
					
					if(n > 0) {
						soma +=n;
					}
				
				}while (n!=0);
				
				System.out.println("A some dos numeros positivos é: "+soma);
	}

}
