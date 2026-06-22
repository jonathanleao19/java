package aula_06_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe_01_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = 0;
		String nome;
			
	do {

		System.out.println("****************************************");
		System.out.println("                                        ");
		System.out.println("      1 - Adcionar Clinte na Fila       ");
		System.out.println("      2 - Listar todos os CLientes      ");
		System.out.println("      3 - Retirar Cliente da Fila       ");
		System.out.println("      0 - Sair                          ");
		System.out.println("                                        ");
		System.out.println("****************************************");
		
		System.out.println("Escolha a Opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) { 

	case 1:
        // Aqui você vai pedir o nome e adicionar na fila
		System.out.print("Digite o nome do cliente: ");
		nome = leia.nextLine();
		
		fila.add(nome);
		break;
		
	case 2:
		System.out.println("--- Clientes na fila ---");
		
		// Este laço lê "para cada 'cliente' do tipo String dentro da 'fila'"
		for (String cliente : fila) {
			System.out.println(cliente); // Imprime um nome por linha
}	
		break;

	case 3:
		if (fila.isEmpty()) {
			System.out.println("A Fila está vazia!");
		} else {
			String clienteChamado = fila.poll(); 
			System.out.println("O Cliente " + clienteChamado + " foi chamado!");
			
			// Mostra quantas pessoas restaram após a remoção
			System.out.println("Ainda restam " + fila.size() + " Cliente(s) aguardando.");
		}
		break;
		
	}	
			
		
	} 	while (opcao != 0);
		System.out.println("O Programa foi finalizado!");
		
		leia.close();

	}

}

		