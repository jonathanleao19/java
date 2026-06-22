package aula_04_repeticoes;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		int qntNumImpares = 0 ;
		int qntNumPares = 0 ;
		
		System.out.println("***** Digite 10 números inteiros *****\n");
			for (int contador = 1; contador <= 10; contador++) {
				
		System.out.print("Digite o " + contador + "º número: ");
	    int numero = leia.nextInt();
			  
		if (numero % 2 == 0) {
			qntNumImpares++;
        } else {
        	qntNumPares++;
        }   	
       
		  
	}
		System.out.println("\n***** RESULTADO FINAL *****");
	    System.out.println("Quantidade de números pares digitados: " + qntNumImpares);
	    System.out.println("Quantidade de números ímpares digitados: " + qntNumPares);	
   
		
		leia.close();
		
	}

}

