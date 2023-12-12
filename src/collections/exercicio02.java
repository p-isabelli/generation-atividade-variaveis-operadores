package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<Integer> listaNumeros = new ArrayList<>();
		int num, posicao ;
		
		System.out.println("Digite 10 números: ");
		for(int i = 0; i < 10; i++) {
			listaNumeros.add(leia.nextInt());
		}
		
		System.out.print("Números digitados: ");
		for(int numeros : listaNumeros) {
			System.out.print(numeros + " ");
		}
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		posicao = listaNumeros.indexOf(num);
		
		if(posicao != -1) {
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
		
		leia.close();
	}
}
