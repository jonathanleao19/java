package aula_05_array;

import java.util.Scanner;

public class Exe_2 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros [][] = {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}
					};
			
		int diagonalPrincipal = 0;
		int diagonalSecundaria = 0;
		
		System.out.print("Números da Diagonal Principal\n");
		
		for (int linha = 0; linha < matrizInteiros.length; linha++) {
            for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {
            
            	if (linha == coluna) {
                    System.out.print(matrizInteiros[linha][coluna] + " ");
                    diagonalPrincipal += matrizInteiros[linha][coluna];
        }
	}
}
	
			System.out.println("\n");
			
            System.out.print("Números da Diagonal Secundária\n");
         
         for (int linha = 0; linha < matrizInteiros.length; linha++) {
             for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {
                
            	 if (linha + coluna == matrizInteiros.length - 1) {
                        System.out.print(matrizInteiros[linha][coluna] + " "); 
                        diagonalSecundaria += matrizInteiros[linha][coluna]; 
     }
   }
}
          
         	System.out.println("\n*****************************************");
	
			System.out.print("Soma dos Números da Diagonal Principal\n" + diagonalPrincipal);
            System.out.print("\nSoma dos Números da Diagonal Secundária\n" + diagonalSecundaria);
                   
 

		leia.close();
    }
}
