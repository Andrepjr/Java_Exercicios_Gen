package java_exercicios_12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String cor1;
		String cor2;
		String cor3;
		String cor4;
		String cor5;
		
		ArrayList <String> cores = new ArrayList<String>();
		
		//entrada das cores pelo usuario
		
		System.out.println("Digite a cor 1 :");
		cor1 = leia.nextLine();
		
		System.out.println("Digite a cor 2 :");
		cor2 = leia.nextLine();
		
		System.out.println("Digite a cor 3 :");
		cor3 = leia.nextLine();
		
		System.out.println("Digite a cor 4 :");
		cor4 = leia.nextLine();
		
		System.out.println("Digite a cor 5 :");
		cor5 = leia.nextLine();
		
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		cores.add(cor4);
		cores.add(cor5);
		
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
