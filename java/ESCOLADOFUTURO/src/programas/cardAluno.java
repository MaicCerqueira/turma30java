package programas;

import java.util.Scanner;

public class cardAluno {


		public static void main(String[] args) 
		{
			//SCANNER
			Scanner leia = new Scanner (System.in);
			
			//VARIÁVEIS
			String matricula [] = new String [3];
			String nome [] = {"Cássia","Bruna","Clari"};
			String situacao [] = new String [3];
			int nota [] = new int [3];
			char op;
			String auxMat;
			int auxNota;
			String auxSit;
			
			//GERADOR DE CÓDIGOS
			for (int x = 0; x < 3; x ++)
			{
				matricula [x] = "MAT-" + (x + 1);
				nota [x] = 0;
				situacao [x] = "?";
			}
			
			//PROCESSAMENTOS E SAÍDAS
			do
			{
				for (int x = 0; x < 3; x ++)
				{
					System.out.printf("%s\t%s\t    %d\t%s\n", matricula [x], nome [x], nota [x], situacao [x]);
				}
				
				System.out.print("\nDIGITE A MATRÍCULA DESEJADA: ");
				auxMat = leia.next().toUpperCase();
				
				for (int x = 0; x < 3; x ++)
				{
					if (auxMat.equals(matricula [x]))
					{
						System.out.print("DIGITE A NOTA DO ALUNE: ");
						auxNota = leia.nextInt();
						System.out.print("DIGITE 'S' PARA ALUNE ATIVE OU 'N' PARA INATIVE: ");
						op = leia.next().toUpperCase().charAt(0);
						
						if (op == 'S')
						{
							nota [x] = auxNota;
							situacao [x] = "ATIVO";
							System.out.printf("%s\t%s\t%d\t%s", matricula [x], nome [x], nota [x], situacao [x]);					
						}
						else
						{	
							situacao [x] = "INATIVO";
							nota [x] = auxNota;
							System.out.printf("%s\t%s\t%d\t%s", matricula [x], nome [x], nota [x], situacao [x]);
						}
						
					}
				}
				
				System.out.print("\nDESEJA CONTINUAR? DIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
				op = leia.next().toUpperCase().charAt(0);
				
			}
			while (op == 'S');
					
		}

	}
	
