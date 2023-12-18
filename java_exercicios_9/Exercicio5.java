package java_exercicios_9;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
		
		String colaborador;
		int cargo;
		float salario;
		
		System.out.println("Digite o seu nome: ");
		colaborador = leia.nextLine();
		
		System.out.println("Digite o seu cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("Digite o Salario: ");
		salario = leia.nextFloat();
		
		switch (cargo) {
		case 1:
			System.out.println("Cargo: Gerente");
			System.out.println("Novo salário R$: "+salario *1.1);
			break;
		case 2:
			System.out.println("Cargo: Vendedor");
			System.out.println("Novo salário R$: "+salario*1.07 );
			break;
		case 3:
			System.out.println("Cargo: Supervisor");
			System.out.println("Novo salário R$: "+salario*1.09);
			break;
		case 4:
			System.out.println("Cargo:Motorista");
			System.out.println("Novo salário R$: "+salario*1.06);
			break;
		case 5:
			System.out.println("Cargo: Estoquista");
			System.out.println("Novo salário R$: "+salario*1.05);
			break;
		case 6:
			System.out.println("Cargo:Tecnico de TI");
			System.out.println("Novo salário R$: "+salario*1.08);
			break;
	
		}
		
		

	}

}
