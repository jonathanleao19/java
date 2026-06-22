package aula_04_repeticoes;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero , somaPositivos = 0;
		
		do {
			System.out.println("Digite um numero inteiro: \n");
			numero = leia.nextInt();
			
			if(numero > 0) {
		        somaPositivos += numero; 
	}
		    } while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + somaPositivos);
		
		
		
		
		leia.close();
		
	}
}	