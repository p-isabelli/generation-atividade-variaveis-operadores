package vetores;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int array_numeros[] = new int[10], soma = 0;
		float media = 0.0f;
		String pares = "", impares = "";
		
		for(int i = 0; i < array_numeros.length; i++) {
			System.out.println("Digite o número " + (i + 1) + ": ");
			array_numeros[i] = leia.nextInt();
			if(i % 2 != 0) {
				impares = impares + " " + array_numeros[i];
			} else if((i % 2 == 0)){
				pares = pares + " " + array_numeros[i];
			}
			
			soma += array_numeros[i];
		}
		
		System.out.println("Os números digitados foram: ");
		
		for(int i = 0; i < array_numeros.length; i++) {
			System.out.println("- " + array_numeros[i]);
		}
		
		leia.close();
		
		media = soma / 10;
		
		System.out.println("Elementos nos índices ímpares: " + impares);
		System.out.println("Elementos nos índices pares: " + pares);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
