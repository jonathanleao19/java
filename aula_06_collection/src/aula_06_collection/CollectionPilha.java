package aula_06_collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push(null);
		pilha.push(null);
		pilha.push(null);
		pilha.push(null);
		pilha.push(null);

		pilha.pop();
		
		System.out.print("A cor Azul ainda está na pilha? " + pilha.contains("Azul"));
		
		for(var cor : pilha) {
			System.out.println(cor);
		}
	}

}
