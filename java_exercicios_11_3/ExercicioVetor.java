package java_exercicios_11_3;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

	        System.out.print("Digite um número para pesquisar: ");
	        int numero = leia.nextInt();
	        int posicao = pesquisarNumero(vetor, numero);

	       
	        if (posicao != -1) {
	            System.out.println("O número " + numero + " está localizado na posição " + posicao + " do vetor.");
	        } else {
	            System.out.println("O número " + numero + " Não foi encontrado!");
	        }
	    }

	    
	    private static int pesquisarNumero(int[] vetor, int numero) {
	        for (int indice = 0; indice < vetor.length; indice++) {
	            if (vetor[indice] == numero) {
	                return indice; 
	            }
	        }
	        return -1; 

	}

}
