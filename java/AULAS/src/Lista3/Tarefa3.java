package Lista3;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE) 

		Scanner read = new Scanner (System.in);
		
		int idade = 0, jovens = 0, idosos = 0, adultos = 0;
		
		while (idade != -99) {
			System.out.println("Informe a idade: ");
			idade = read.nextInt();
			if (idade < 21 && idade >= 0) {
				jovens++; 
			} else if (idade > 50) {
				idosos++;
			} else if (idade < 0 && idade != -99) {
				System.out.println("Valor inválido");
			} else if (idade >= 21 && idade <= 50){
				adultos++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: " + 
		jovens + "\nO total de pessoas entre 21 e 50 anos é: " + 
		adultos + "\nO total de pessoas maiores de 50 anos é: "+ idosos);
	}

}
