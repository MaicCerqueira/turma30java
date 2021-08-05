package Lista1;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-aexpressa em anos, meses e dias.
		
        Scanner leia = new Scanner(System.in);
		
		int dias;
		int meses;
		int anos;
		int idade;
		int idadeDias;
		
		System.out.println("Insira sua idade em dias aqui: \n");
		idadeDias = leia.nextInt();
		
		anos = idadeDias/365;
		meses = (idadeDias%365);
		dias = (idadeDias%365)%30;
		System.out.println("Você tem: "+anos+" anos de idade, "+meses+" meses e "+dias+" dias de vida!");
		
	}
}

	


