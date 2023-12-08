package java_exercicios_10_2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:
		
		Scanner leia = new Scanner(System.in);
		
		int numeros, par = 0, impar = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println("Digite o "+i+"º numero: ");
			numeros = leia.nextInt();
			if(numeros % 2 == 0) {
				par++;
			}
			
			if (numeros % 2 == 1){
			impar++;
			}
		

		}
		System.out.println("Total de numeros pares: "+par);
		System.out.println("Total de numeros impares: "+impar);
	}
	
}
