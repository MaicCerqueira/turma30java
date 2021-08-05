package Lista1;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		// Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		// aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
		// respectivamente.
		
        Scanner leia = new Scanner(System.in);
		
		int media;
		int n1;
		int n2;
		int n3;
		String nome; 
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Nota do alun(a) X:");
		n1 = 2;
		System.out.println("Nota 1: "+n1);
		n2 = 3;
		System.out.println("Nota 2: "+n2);
		n3 = 5;
		System.out.println("Nota 3: "+n3);
		
		media = n1+n2+n3/3;
		System.out.println("Nome do aluno(a): " +nome+ " Média do aluno(a): " +media);

	}

}
