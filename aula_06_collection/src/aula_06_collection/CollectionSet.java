package aula_06_collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maça");
		frutas.add("Abacate");
		frutas.add("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
		System.out.println("A fruta Laranja esta presente? " + frutas.contains("Laranja"));
		
		frutas.remove("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}	
	}

}
