package atividade_pratica_01;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Número 1: ");
        double num1 = input.nextDouble();
        
        System.out.print("Número 2: ");
        double num2 = input.nextDouble();
        
        System.out.println("Escolha a operação:");
        
        System.out.println("1 – Soma\n2 – Subtração\n3 – Multiplicação\n4 – Divisão");
        
        System.out.print("Operação: ");
        int operacao = input.nextInt();
        
        switch (operacao) {
        case 1:
            System.out.println("Operação: Soma | Resultado: " + (num1 + num2));
            break;
        case 2:
            System.out.println("Operação: Subtração | Resultado: " + (num1 - num2));
            break;
        case 3:
            System.out.println("Operação: Multiplicação | Resultado: " + (num1 * num2));
            break;
        case 4:
          
            if (num2 != 0) {
                System.out.println("Operação: Divisão | Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: Não é possível dividir por zero.");
            }
            break;
        default:
            System.out.println("Erro: Código de operação inválido.");
            break;
    }
    
        input.close();

}
		
		

	}

