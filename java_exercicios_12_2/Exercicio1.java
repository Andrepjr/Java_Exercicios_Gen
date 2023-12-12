package java_exercicios_12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String cor;
		
		ArrayList <String> cores = new ArrayList<String>();
		
		//entrada de dados
		for(int i=0; i < 5; i++){
			System.out.println("Digite uma cor : ");
			cor = leia.nextLine();
			cores.add(cor);
		}
			
	
		
		
		System.out.println("Cores escolhidas: ");
		for(String n : cores) {
			System.out.println(n);
		}
		
		Collections.sort(cores);
		System.out.println("\nCores ordenadas:");
		for(String n : cores) {
			System.out.println(n);
		}


	}

}
