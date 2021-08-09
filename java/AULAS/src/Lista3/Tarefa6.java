package Lista3;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado. E no
		// final imprimir a média dos números múltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)
		
Scanner read = new Scanner (System.in);
		
		int num = 0, media = 0, contador = 0;
		
		do {
			System.out.println("Digite um número, para finalizar digite \"0\"");
			num = read.nextInt();
			if (num % 3 == 0) {
				media += num;
				contador++;
			}
		} while (num != 0);
		
		media = media / contador;
		
		System.out.println("A média de todos os números múltiplos de 3 digitados é: " + media);
	}

}


