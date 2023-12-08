package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int i, pares = 0, impares = 0, numeros;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número: ");
			numeros = leia.nextInt();
			
			if(numeros % 2 == 0) {
				pares += 1;
			} else {
				impares += 1;
			}	
		}
		
		leia.close();
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
	}
}
