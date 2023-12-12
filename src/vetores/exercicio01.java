package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio01 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int posicao = 0, num = 0, opcao = 1;
		
		int array_numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Arrays.sort(array_numeros);
		
		for(int i = 0; i < array_numeros.length; i++) {
			System.out.println("N°: " + array_numeros[i]);
		}
		
		while(opcao == 1) {
			System.out.println("\nDigite o número que deseja encontrar: ");
			num = leia.nextInt();
		
			posicao = Arrays.binarySearch(array_numeros, num);
			
			if(posicao >= 0) {
				System.out.println("\nO elemento foi Encontrado e está na Posição: " + posicao);
			}else {
				System.out.println("\nElemento não encontrado!");
			}
			
			System.out.println("\nDeseja encontrar mais algum número? \n1 - Sim\n2 - Não");
			opcao = leia.nextInt();
		}
		
		leia.close();
	}
}
