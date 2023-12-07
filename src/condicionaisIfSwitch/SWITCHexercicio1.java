package condicionaisIfSwitch;

import java.util.Scanner;

public class SWITCHexercicio1 {
	public static void main(String args[]) {
		int quantidade, codigo, total = 0;
		String produto = "";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Cardápio: \n1 - Cachorro Quente - R$10,00\n2 - X-Salada - R$15,00\n"
				+ "3 - X-Bacon - R$18,00\n4 - Bauru - R$12,00\n5 - Refrigerante - R$8,00\n6 - Suco de Laranja - R$ 13,00");
		
		System.out.println("\nCódigo do produto: ");
		codigo = leia.nextInt();
		
		if(codigo <= 0 || codigo > 6) {
			System.out.println("Código inválido");
		} else {
			System.out.println("Quantidade: ");
			quantidade = leia.nextInt();
			
			switch (codigo){
				case 1: 
					total = quantidade * 10;
					produto = "Cachorro-quente";
					break;
				case 2:
					total = quantidade * 15;
					produto = "X-Salada";
					break;
				case 3:
					total = quantidade * 18;
					produto = "X-Bacon";
					break;
				case 4:
					total = quantidade * 12;
					produto = "Bauru";
					break;
				case 5:
					total = quantidade * 8;
					produto = "Refrigerante";
					break;
				case 6:
					total = quantidade * 13;
					produto = "Suco de laranja";
					break;
				default:
					System.out.println("Opção inválida");
		}	
		
		leia.close();
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor total: R$" + total + ",00");
		
		}
	}
}
