package vetores;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int[][] matrizInt = new int[3][3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		
		
		for(int linha = 0; linha < matrizInt.length; linha++) {
			 for (int coluna = 0; coluna < 3; coluna++) {
				 System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
		         matrizInt[linha][coluna] = leia.nextInt();
			 }
		}
		
		System.out.println("\nElementos da diagonal primária:");
		for(int linha = 0; linha < matrizInt.length; linha++) {
			 for (int coluna = 0; coluna < 3; coluna++) {
				 if(matrizInt[linha] == matrizInt[coluna]) {
					 System.out.print(matrizInt[linha][coluna] + " ");
					 somaDiagonalPrincipal += matrizInt[linha][coluna];
				 } 
			 }
		}
		
		System.out.println("\nElementos da diagonal secundária:");
        for (int linha = 0; linha < matrizInt.length; linha++) {
            System.out.print(matrizInt[linha][matrizInt.length - 1 - linha] + " ");
            somaDiagonalSecundaria += matrizInt[linha][matrizInt.length - 1 - linha];
        }
        
        leia.close();
		
        System.out.println("\nA soma da diagonal principal é: " + somaDiagonalPrincipal);
        System.out.println("A soma da diagonal secundária é: " + somaDiagonalSecundaria);

	}
}
