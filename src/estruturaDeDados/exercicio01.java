package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> listaClientes = new LinkedList<>();
		int op = 1;
		String nome = "", clienteRemovido = "";
		
		while(op != 0) {
			
			System.out.println("\nSelecione uma opção: \n\n1 - Adicionar um novo Cliente na fila\n\n2 - Listar todos os Clientes na fila"
					+ "\n\n3 - Chamar (retirar) uma pessoa da fila\n\n0 - Finalizar programa\n");
			op = leia.nextInt();
			
			switch(op){
				case 1:
					System.out.println("Digite o nome do cliente: ");
					nome = leia.next();
					listaClientes.add(nome);
					break;
				case 2:
					System.out.print("\tFila: ");
					for(String clientes : listaClientes) {
						System.out.print(clientes + " ");
					}
					break;
				case 3:
					System.out.println("Quem deseja remover? Fila: " + listaClientes + "\n");
					clienteRemovido = leia.next();
					if(listaClientes.contains(clienteRemovido)) {
						listaClientes.remove(clienteRemovido);
						System.out.println("\tCliente chamado: " + clienteRemovido);
						System.out.println("\t\nFila atual: " + listaClientes);
					} else {
						System.out.println("\tCliente não encontrado\n");
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida");
			}
		} 
		leia.close();
	}
}

	
