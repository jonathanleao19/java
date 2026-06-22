package atividade_pratica_01;

import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
	
    Scanner leia = new Scanner(System.in);
    String nome;
	int idade;
	
	System.out.println("Digite o seu nome: ");
	nome = leia.nextLine();
	
	System.out.println("Digite a sua idade: ");
	idade = leia.nextInt();
	
	// Criei a variável de autorização começando como 'false' se for maior de 18 anos ignora o primeiro if
	
	boolean possueAutorizacao = false;
	
	if (idade < 18) {
	    System.out.println("Possue autorização? (true/false): ");
	    possueAutorizacao = leia.nextBoolean();
	}
	
	if (idade >= 18 || possueAutorizacao) {
	    System.out.println("Acesso liberado para " + nome);
	} else {
	    System.out.println("Acesso negado para " + nome);
	
}	
	
	
	leia.close();
}

}