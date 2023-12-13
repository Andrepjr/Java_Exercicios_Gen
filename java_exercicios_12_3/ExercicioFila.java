package java_exercicios_12_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int menu;
		String nome;
		
		Queue<String> fila = new LinkedList<String>();
		Iterator <String> iterator = fila.iterator();
		

	do {
		System.out.println("\n*****************************************\n");
		System.out.println("\n1 - Adicionar cliente na fila ");
		System.out.println("2 - Listar todos os clientes ");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - sair");
		System.out.println("\n*****************************************\n");
		System.out.println("\nDigite uma opção: ");
		menu = leia.nextInt();
		leia.nextLine();
		
		switch (menu) {
		case 1 :
			System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: \n");
				for (String n : fila) {
					System.out.println(n);
				}
				System.out.println("\nCliente Adicionado!\n");
				break;
		
		
		case 2 : 
			System.out.println("Lista de Clientes na Fila: \n");
			for (String n : fila) {
				System.out.println(n);
			}
			break;
				
		
		
		case 3 : 
			if(fila.isEmpty()) {
				System.out.println("A fila esta vazia. ");
			}
			else {
				fila.remove();
				for (String n : fila) {
					System.out.println(n);
				}
				System.out.println("O cliente foi chamado!");
			}
			
		}
		
		

	}
	while (menu!= 0);
	System.out.println("Programa Finalizado!");
	leia.close();

}
}
