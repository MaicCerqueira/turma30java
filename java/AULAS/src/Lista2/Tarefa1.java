package Lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior. 

Scanner read = new Scanner(System.in);
		
		int num1,num2,num3,maiorNum;
		
		System.out.println("Digite o primeiro número: ");
		num1 = read.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = read.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = read.nextInt();
		
		if(num1>num2 && num1>num3) {
		System.out.println("O primeiro número é o maior de todos.");
		}
		if(num2>num1 && num2>num3) {
		System.out.println("O segundo número é o maior de todos.");
		}
		if(num3>num2 && num3>num1) {
		System.out.println("O terceiro número é o maior de todos.");
		}
		
	}
}
 
