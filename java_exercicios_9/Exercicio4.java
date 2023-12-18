package java_exercicios_9;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		
		int codigo;
		int quantidade;
		int cq = 10;
		int xs = 15;
		int xb = 18;
		int bauru = 12;
		int refri = 8;
		int suco = 13;

		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("\nDigite o código do produto selecionado: ");
		codigo = leia.nextInt();

		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro-Quente");
			System.out.println("Valor total: " + (cq * quantidade));
			break;
		case 2:
			System.out.println("Produto: X-salada");
			System.out.println("Valor total: " + (xs * quantidade));
			break;
		case 3:
			System.out.println("Produto: X-bacon");
			System.out.println("Valor total: " + (xb * quantidade));
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: " + (bauru * quantidade));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: " + (refri * quantidade));
			break;
		case 6:
			System.out.println("Produto: suco de laranja");
			System.out.println("Valor total: " + (suco * quantidade));
			break;
			
			default:
			System.err.println("Opção Inválida");
		}


	}

}
