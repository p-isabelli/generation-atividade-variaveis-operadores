package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
	
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				menor21 += 1;
			} else if (idade > 50){
				maior50 += 1;
			}
		}
		
		leia.close();
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
	}
}
