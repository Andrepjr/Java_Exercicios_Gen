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
		
		int numero;
		
		Set <Integer> setNumero= new HashSet<Integer>();
		
		//entrada de dados
		for (int i = 0; i < 10; i++ ){
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			setNumero.add(numero);
		}
	
		Iterator <Integer> isetNumero = setNumero.iterator();
		System.out.println("Listar dados do set: ");
		while(isetNumero.hasNext()) {
			System.out.println(isetNumero.next());
		}
				

	}

}
