package Lista4;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		System.out.println("Preencha a ficha técnica do avião");
		System.out.println("Digite o nome: ");
		aviao1.nome = leia.next();
		System.out.println("Digite o tipo(Comercial, executivou ou militar: ");
		aviao1.tipo = leia.next();
		System.out.println("Digite o comprimento (Em metros): ");
		aviao1.comprimento = leia.nextInt();
		System.out.println("Digite a capacidade de carga (Em kg): ");
		aviao1.capacidadeCarga = leia.nextInt();
		System.out.println("Digite a altitude máxima de voo (Em metros): ");
		aviao1.altitudeVoo = leia.nextInt();
		System.out.println("Digite a velocidade máxima (Em Km/h: ");
		aviao1.velocidadeMaxima = leia.nextInt();
		
		aviao1.av1();

		
	}



}


