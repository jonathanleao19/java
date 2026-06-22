import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		System.out.print("Digite o salario: ");
		salario = sc.nextFloat();
		
		System.out.print(" Digite o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu novo salario: %.2f", novoSalario);
	
	
	
	}

}
