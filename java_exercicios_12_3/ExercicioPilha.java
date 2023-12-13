package java_exercicios_12_3;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int menu;
		String livro;
		
		
		do {
			System.out.println("\n************************************\n");
			System.out.println("\n1 - Adicionar livro na pilha ");
			System.out.println("2 - Listar todos os livros ");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - sair\n");
			System.out.println("************************************\n");
			System.out.println("\nDigite uma opção: ");
			menu = leia.nextInt();
			leia.nextLine();
			
			switch (menu) {
			case 1:
				System.out.println("Digite o nome do livro: ");
					livro = leia.nextLine();
					pilha.add(livro);
					for(String p : pilha){
						System.out.println(p);
					}
					break;
					
			case 2: 
				System.out.println("Lista de livros na pilha: \n");
				for (String n : pilha)
					System.out.println(n);
				break;
				
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia! ");
				}else {
					pilha.pop();
					for(String p : pilha){
						System.out.println(p);
					}
					System.out.println("\nUm Livro foi retirado da pilha! ");
				
				}
				
				
			}
			
			
		}
		while (menu!= 0);
		System.out.println("Programa Finalizado!");
		leia.close();
		
	}
}
