package Lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.

		Scanner read = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = read.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" � par! e a raiz quadrada desse n�mero �: "+Math.sqrt(num));	
		}
		if(num%2==1) {
			System.out.println(num+" � �mpar! e esse n�mero elevado ao quadrado �: "+Math.pow(num, 2));
		}
	}
}
