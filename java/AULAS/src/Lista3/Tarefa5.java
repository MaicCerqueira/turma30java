package Lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um
		// número igual a zero. No final, mostre a soma dos números
		// digitados.(DO...WHILE)

		Scanner read = new Scanner (System.in);
		
		double num = 0.0, soma = 0.0;
		
		do {
			System.out.println("Digite um número, para finalizar digite \"0\"");
			num = read.nextDouble();
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos números digitados é20: " + soma);
	}

	}


