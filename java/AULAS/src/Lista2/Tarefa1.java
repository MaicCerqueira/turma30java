package Lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. 

Scanner read = new Scanner(System.in);
		
		int num1,num2,num3,maiorNum;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = read.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = read.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = read.nextInt();
		
		if(num1>num2 && num1>num3) {
		System.out.println("O primeiro n�mero � o maior de todos.");
		}
		if(num2>num1 && num2>num3) {
		System.out.println("O segundo n�mero � o maior de todos.");
		}
		if(num3>num2 && num3>num1) {
		System.out.println("O terceiro n�mero � o maior de todos.");
		}
		
	}
}
 
