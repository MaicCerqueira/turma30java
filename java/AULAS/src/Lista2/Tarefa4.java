package Lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		// Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.

		Scanner read = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = read.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" É par! e a raiz quadrada desse número é: "+Math.sqrt(num));	
		}
		if(num%2==1) {
			System.out.println(num+" É ímpar! e esse número elevado ao quadrado é: "+Math.pow(num, 2));
		}
	}
}
