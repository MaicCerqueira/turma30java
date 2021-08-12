package programa;

import classe.Cachorro;
import classe.Cavalo;
import classe.Preguica;

public class Fazenda {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("Shuri", 5, true, true);
		Cavalo horse = new Cavalo("Killmonger", 6, true, true);
		Preguica preg = new Preguica("T'challa", 2, true, true);
		
		System.out.printf("Cachorro\nNome: %s\nIdade: %d anos", dog.getNome(), dog.getIdade());
		dog.corre();
		dog.emiteSom();
		
		System.out.println("\n");
		
		System.out.printf("Cavalo\nNome: %s\nIdade: %d anos", horse.getNome(), horse.getIdade());
		horse.corre();
		horse.emiteSom();
		
		System.out.println("\n");
		
		System.out.printf("Preguiça\nNome: %s\nIdade: %d anos", preg.getNome(), preg.getIdade());
		preg.subir();
		preg.emiteSom();
		

	}

}