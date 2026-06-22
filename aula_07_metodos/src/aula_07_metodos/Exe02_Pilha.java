package aula_07_metodos;

import java.util.Scanner;
import java.util.Stack;

public class Exe02_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//criação da collection stack (pilha) de objetos string
		Stack<String> pilhaLivros = new Stack<String>();
		
		int opcao = 0;
		String nomeLivro;
		
		do {
			
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("      1 - Adcionar Livro na Pilha       ");
			System.out.println("      2 - Listar todos os Livros        ");
			System.out.println("      3 - Retirar Livro da Pilha        ");
			System.out.println("      0 - Sair                          ");
			System.out.println("                                        ");
			System.out.println("****************************************");
		
		
			System.out.println("Escolha a Opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
		
			switch(opcao) { 
			case 1:
				
				System.out.print("Digite o nome do Livro: ");
				String nomeLivro1 = leia.nextLine();
				pilhaLivros.push(nomeLivro1);
				
				System.out.println("\nPilha: ");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!\n");
				break;
				
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A Pilha está vazia!\n");
				} else {
					System.out.println("Lista de Livros na Pilha:");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
					System.out.println();
				}
				break;
				
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A Pilha está vazia!\n");
				} else {
					pilhaLivros.pop();
					System.out.println("Pilha: ");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
					System.out.println("\nUm Livro foi retirado da pilha!\n");
				}
				break;
				
			case 0: 
				System.out.println("O Programa foi finalizado!");
				break;
				
			default:
				System.out.println("Opção Inválida, tente novamente!\n");
				break;		
		}
		
	} while (opcao != 0);
		
		
		leia.close();
			
	}
		
}
