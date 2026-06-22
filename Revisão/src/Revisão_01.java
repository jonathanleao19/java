import java.util.Scanner;

public class Revisão_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		
		double precoInteiro = 40.0;
		double precoFinal;
		boolean estudante = true;

		if (estudante == true) {
		    precoFinal = precoInteiro / 2; // Divide por 2
		    System.out.println("Valor Meia Ingresso: R$ " + precoFinal);
		} else {
		    precoFinal = precoInteiro; // Mantém o valor cheio
		    System.out.println("Valor ingresso Inteira: R$ " + precoFinal);
		}
		
		leia.close();
	}
}
