package aula_03_operadores;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String nome;
	int idade;
	boolean primeiraDoacao;
	
	
	System.out.println("Digite o nome do doador: ");
	nome = leia.nextLine();

	System.out.println("Digite a sua idade: ");
	idade = leia.nextInt();

	System.out.println("É a sua primeira doação? (true/false): ");
	primeiraDoacao = leia.nextBoolean();
	
		if ((idade >= 18  && idade < 60)
			|| (idade >= 60 && idade <= 69 && !primeiraDoacao)) {
		
	System.out.println(nome + " está APTO para doar sangue.");
	}	else {
		
	System.out.println(nome + " não esta APTO para doar sangue.");
	}	

	leia.close();
	

	}

}
