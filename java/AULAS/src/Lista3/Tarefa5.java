package Lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		// Crie um programa que leia um n�mero do teclado at� que encontre um
		// n�mero igual a zero. No final, mostre a soma dos n�meros
		// digitados.(DO...WHILE)

		Scanner read = new Scanner (System.in);
		
		double num = 0.0, soma = 0.0;
		
		do {
			System.out.println("Digite um n�mero, para finalizar digite \"0\"");
			num = read.nextDouble();
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos n�meros digitados �20: " + soma);
	}

	}


