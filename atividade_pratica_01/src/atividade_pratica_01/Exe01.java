package atividade_pratica_01;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean possueAutorizacao;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Possue autorização? (true/false): ");
		possueAutorizacao = leia.nextBoolean();
		
		if (idade >= 18 || (idade < 18 && possueAutorizacao)) {
		
		System.out.println("Acesso liberado para " + nome);
	}	else {
			
		System.out.println("Acesso negado para " + nome);
	}	
		
		
		leia.close();
	}

}
