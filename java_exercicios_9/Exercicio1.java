package java_exercicios_9;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int A, B, C;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o numero B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o numero C: ");
		C = leia.nextInt();
		
		if (A + B > C){
			System.out.println("A Soma de A + B é Maior do que C");
			
		}
		
		else if (A + B < C) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else if (A + B == C) {
			System.out.println("A Soma de A + B é Igual a C");
		}

	}

}
