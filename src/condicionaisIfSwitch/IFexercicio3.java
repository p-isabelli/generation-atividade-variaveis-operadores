package condicionaisIfSwitch;

import java.util.Scanner;

public class IFexercicio3 {
	public static void main(String args[]) {
		int idade;
		String nome;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tDigite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("\tDigite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("\tPrimeira doação de sangue?");
		doacao = leia.nextBoolean();
		
		leia.close();
		
		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " \testá apto para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && doacao == true) {
			System.out.println(nome + " \tnão está apto para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && doacao == false) {
			System.out.println(nome + " \testá apto para doar sangue!");
		} else {
			System.out.println(nome + " \tnão está apto(a) para doar sangue!");
		}	
	}
}
