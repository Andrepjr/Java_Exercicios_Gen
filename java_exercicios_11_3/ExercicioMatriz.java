package java_exercicios_11_3;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		
		int matriz [][] = new int [3][3];
		int dp=0;
		//leitura
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 3; coluna++) {
				System.out.println("Digite um numero:");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		//apresentação
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 3; coluna++) {
				
			}
			
		}
		//diagonal principal 
		System.out.println("Diagonal Principal: ");
		for(int linha=0; linha < 3; linha++) {
			System.out.print(matriz[linha][linha]);
					
					
				}
		
		System.out.println("\n");
		
		//diagonal secundaria
		System.out.println("Diagonal secundaria: ");		
		for(int linha=0; linha < 3; linha++) {
					System.out.print(+matriz[linha][3-1-linha]);
						}
	
	
	}

}


