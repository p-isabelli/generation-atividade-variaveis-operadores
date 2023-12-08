package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);	
		
		int n, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();	
			
			if(n % 2 == 0) {
				soma += n;
			}
		}while(n != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();
	}
}
