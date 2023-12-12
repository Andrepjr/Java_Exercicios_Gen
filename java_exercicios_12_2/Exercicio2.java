package java_exercicios_12_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1;
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();

		int n2;
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();

		int n3;
		System.out.println("Digite o terceiro numero: ");
		n3 = leia.nextInt();
		
		int n4;
		System.out.println("Digite o quarto numero: ");
		n4 = leia.nextInt();
		
		int n5;
		System.out.println("Digite o quarto numero: ");
		n5 = leia.nextInt();
		
		int n6;
		System.out.println("Digite o quarto numero: ");
		n6 = leia.nextInt();
		
		int n7;
		System.out.println("Digite o quarto numero: ");
		n7 = leia.nextInt();
		
		int n8;
		System.out.println("Digite o quarto numero: ");
		n8 = leia.nextInt();
		
		int n9;
		System.out.println("Digite o quarto numero: ");
		n9 = leia.nextInt();
		
		int n10;
		System.out.println("Digite o quarto numero: ");
		n10 = leia.nextInt();
		
	
		
		
		Set <Integer> setNumero= new HashSet<Integer>();
		
		setNumero.add(n1);
		setNumero.add(n2);
		setNumero.add(n3);
		setNumero.add(n4);
		setNumero.add(n5);
		setNumero.add(n6);
		setNumero.add(n7);
		setNumero.add(n8);
		setNumero.add(n9);
		setNumero.add(n10);
		
		Iterator <Integer> isetNumero = setNumero.iterator();
		System.out.println("Listar dados do set: ");
		while(isetNumero.hasNext()) {
			System.out.println(isetNumero.next());
		}
		
		
		

	}

}
