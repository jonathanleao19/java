package aula_03_operadores;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3;
		int soma;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = leia.nextInt();
		
		System.out.printf("\nValores digitados: %d, %d, %d" , numero1, numero2, numero3);
		
		soma = numero1 + numero2;
				
		System.out.printf("\n%d + %d = %d\n" , numero1 , numero2, numero1 + numero2);
		if(soma > numero3) {
			System.out.println("A soma dos numeros 1 e 2 é maior que o 3");
	}	else if (soma == numero3) {
			System.out.println("A soma dos numeros 1 e 2 é iual que o 3");
	}	else {
			System.out.println("A soma dos numeros 1 e 2 é menor que o 3");
	}
		
	
	leia.close();

	}

}
