package java_exercicios_10_2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num =0, soma=0, qtd=0;
		double media = 0;
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if(num % 3 == 0 && num !=0){
				qtd++;
				soma += num;
			}
		}while (num !=0);
		
		media = (double)(soma/qtd);
		System.out.println("A media de todos os numeros multiplos de 3 é: "+media);
	

	}

}
