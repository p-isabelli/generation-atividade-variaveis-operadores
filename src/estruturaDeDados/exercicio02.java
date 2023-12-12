package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio02 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> listaLivros = new Stack<>();
		int op = 0;
		
		do {
			System.out.println("\nEscolha uma opção: \n\n1 - Adicionar um novo livro na pilha\n2 - Listar todos os livros da Pilha\n"
					+ "3 - Retirar um livro da pilha\n0 - Encerrar");
			op = leia.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("\nDigite o nome do livro: ");
					listaLivros.push(leia.next());
					break;
				case 2:
					System.out.println("Lista de Livros na Pilha: " + listaLivros);
					break;
				case 3:
					if(listaLivros.isEmpty()) {
						System.out.println("\nA lista já está vazia.");
					} else {
						System.out.println("Lista de Livros na Pilha: " + listaLivros);
						listaLivros.pop();
						System.out.println("\nUm Livro foi retirado da pilha!");
						System.out.println("\nLista de Livros na Pilha: " + listaLivros);
					}
					break;
				case 0:
					System.out.println("Programa Finalizado!");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		}while(op != 0);
		
		leia.close();
		
	}
}
