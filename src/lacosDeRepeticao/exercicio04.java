package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, genero = 0, cargo = 0, devBack = 0, devFront = 0, devMobile = 0, devFull = 0, totalParticipantes = 0, contIdade = 0;
		String op = "S";
		float media = 0.2f;
		
		while(!op.equalsIgnoreCase("N") && !op.equalsIgnoreCase("n")) {
			
			System.out.println("Idade: ");
			idade = leia.nextInt();
			
			while(idade < 0 || idade > 100) {
				System.out.println("Idade: ");
				idade = leia.nextInt();
			}
			
			contIdade += idade;
			
			System.out.println("Identidade de gênero: \n1 - Mulher Cis\n2 – Homem Cis\n3 – Não Binário\n"
					+ "4 – Mulher Trans\n5 – Homem Trans\n6 – Outros\n");
			genero = leia.nextInt();
				
			while(genero < 1 || genero > 6) {
				System.out.println("Identidade de gênero: \n1 - Mulher Cis\n2 – Homem Cis\n3 – Não Binário\n"
						+ "4 – Mulher Trans\n5 – Homem Trans\n6 – Outros\n");
				genero = leia.nextInt();
			}
				
			System.out.println("Pessoa desenvolvedora: \n1 – Backend\n2 – Frontend\n3 – Mobile\n"
					+ "4 – FullStack\n");
			cargo = leia.nextInt();
			
			while(cargo < 1 || cargo > 4) {
				System.out.println("Pessoa desenvolvedora: \n1 – Backend\n2 – Frontend\n3 – Mobile\n"
						+ "4 – FullStack\n");
				cargo = leia.nextInt();
			}
				
			//O número total de pessoas que responderam à pesquisa
			totalParticipantes++;
		
			//Total de pessoas desenvolvedoras Backend
			if(cargo == 1) {
				devBack++;
			}
			
			//O número de Mulheres Cis e Trans desenvolvedoras Frontend
			if(genero == 1 && cargo == 2 || genero == 4 && cargo == 2) {
				devFront++;
			} 
			
			//O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
			if(genero == 2 && cargo == 3 && idade > 40 || genero == 5 && cargo == 3 && idade > 40) {
				devMobile++;
			} 
			
			//O número de Não Binários desenvolvedores FullStack menores de 30 anos
			if(genero == 3 && cargo == 4 && idade < 30) {
				devFull++;
			}
			
			System.out.println("Deseja continuar a leitura dos dados de um novo colaborador ou não (S/N)");
			op = leia.next();
		}
		
		leia.close();
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + devBack);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + devFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + devMobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + devFull);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalParticipantes);
	
		//A média de idade das pessoas que responderam à pesquisa
		if(totalParticipantes != 0 && totalParticipantes > 1) {
			media = contIdade /totalParticipantes;
			System.out.println("A média de idade das pessoas que responderam à pesquisa: " + media);
		} 
				
	}
}
