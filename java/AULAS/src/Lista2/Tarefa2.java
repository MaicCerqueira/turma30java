package Lista2;

import java.util.Scanner;

public class Tarefa2 {
	
	// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

	public static void main(String[] args) {
		
			Scanner read = new Scanner(System.in);
			
			int num1,num2,num3;
			System.out.println("Di10gite o primeiro n�mero ");
			num1 = read.nextInt();
			System.out.println("Digite o segundo n�mero ");
			num2 = read.nextInt();
			System.out.println("Digite o terceiro n�mero ");
			num3 = read.nextInt();

			if(num1==num2 && num2==num3) {
				System.out.printf("%d -  %d - %d",num1,num2,num3);
			}
			else if(num1>num2 && num2>num3) {
				System.out.printf("%d - %d - %d",num3,num2,num1);
			}
			else if(num1>num2 && num1>num3 && num3>num2) {
				System.out.printf("%d - %d - %d",num2,num3,num1);
			}
			else if(num2>num1 && num2>num3 && num3>num1) {
				System.out.printf("%d - %d - %d",num1,num3,num2);
			}
			else if(num3>num1 && num3>num2 && num2>num1) {
				System.out.printf("%d - %d - %d",num1,num2,num3);
			}
		}
		

	}


