package atividade_pratica_01;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		String nome;
		float nota;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite sua nota: ");
		nota = leia.nextFloat();
				
		if (nota >= 7){
			System.out.println("Aluno: " + nome + " - Nota: " + nota + " - Situação: Aprovado! ");
			
	}	else if (nota >= 5 && nota < 7) {
			System.out.println("Aluno: " + nome + " - Nota: " + nota + " - Situação: Recuperação! ");		
			
	}	else {
			System.out.println("Aluno: " + nome + " - Nota: " + nota + " - Situação: Reprovado! ");	
	}

		leia.close();
		
	}	
}	