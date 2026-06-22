package aula_05_array;

import java.util.Scanner;

public class Exe01_Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = { 4, 2, 7, 5, 8, 10, 3, 15, 40, 42 };
		
		double vetorDouble[] = new double[5];
		
		for (int linha = 0; linha < vetorInteiros.length; linha++) {
            System.out.printf("vetorInteiros[%d] = %d\n", linha, vetorInteiros[linha]);
        }
        
       
		for (int linha = 0; linha < vetorDouble.length; linha++) {
            System.out.printf("Digite um número: ");
            vetorDouble[linha] = leia.nextDouble();
		
            int posicaoReal = -1; 
            for (int i = 0; i < vetorInteiros.length; i++) {
                if (vetorInteiros[i] == vetorDouble[linha]) {
                    posicaoReal = i;
                    break; 
                }
            }
            
            // Exibe a resposta correta com base na busca
            if (posicaoReal != -1) {
                System.out.printf("O número %.0f esta localizado na posição [%d]\n", vetorDouble[linha], posicaoReal);
            } else {
                System.out.printf("O número %.0f não foi encontrado! \n", vetorDouble[linha]);
            }
        }                
         
		leia.close();
	}		
}