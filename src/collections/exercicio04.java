package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> listaNumeros = new HashSet<>();
		int num;
		boolean posicao;
		
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		for(int numero : numeros) {
			listaNumeros.add(numero);
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		posicao = listaNumeros.contains(num); 
		
		if(posicao) {
			System.out.println("O número " + num + " foi encontrado!");
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
		
		leia.close();
		
	}

}
