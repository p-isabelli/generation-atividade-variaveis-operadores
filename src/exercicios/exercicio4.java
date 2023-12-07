package exercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String args[]) {
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tNúmero 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("\tNúmero 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\tNúmero 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("\tNúmero 4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2) - (n3*n4);
		
		System.out.printf("\tDiferença: %.1f", diferenca);
		
		
		
		
	}
}
