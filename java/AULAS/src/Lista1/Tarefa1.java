package Lista1;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		// Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		
		Scanner leia = new Scanner(System.in);
		
		int dias;
		int meses;
		int idade;
		int anos;
		int idadeDias;
		
		System.out.print("Digite o dia em que nasceu: ");
		dias = leia.nextInt();
		System.out.print("Digite o mês em que nasceu: ");
		meses = leia.nextInt();
		System.out.print("Digite o ano em que nasceu: ");
		anos = leia.nextInt();
		
		idade = 2021 - anos;
		
		idadeDias = (idade*365) + dias + (meses*30);
		System.out.println("Você tem "+idadeDias+" dias de vida.");
	}
}

	


