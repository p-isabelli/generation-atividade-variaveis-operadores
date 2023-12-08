package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio06 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);	
		int n, soma = 0, cont = 0;
		double media = 0.0;
		
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();	
			
			if(n % 3 == 0 && n != 0) {
				soma += n;
				cont++;
			}
		}while(n != 0);
		
		if(cont != 0) {
			media = soma / cont;
		}
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
		leia.close();
	
	}
}
