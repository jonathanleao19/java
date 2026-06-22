package aula_04_repeticoes;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, menor21 = 0, maior50 = 0; 
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			
			if(idade <= 21) {
			menor21++; 		
				
		}   else if (idade > 50) {
			maior50++;	
	}		 
		System.out.print("Digite a próxima idade (ou negativa para sair): ");
		idade = leia.nextInt(); 
		
						
}		System.out.println("*************************");
		System.out.println("Menores de 21: " + menor21);
		System.out.println("Maiores de 50: " + maior50);
		System.out.println("*************************");
		
		leia.close();

	}

}
