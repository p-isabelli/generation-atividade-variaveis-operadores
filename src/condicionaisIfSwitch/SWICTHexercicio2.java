package condicionaisIfSwitch;

import java.util.Scanner;

public class SWICTHexercicio2 {
	public static void main(String args[]) {
		String nome, cargo = "";
		int codigoCargo;
		float salario, novoSalario = 0.0f;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("1 - Gerente\n2 - Vendedor\n3 - Supervisor\n4 - Motorista\n5 - Estoquista\n6 - Técnico de TI");
		
		System.out.println("\nNome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Código do cargo: ");
		codigoCargo = leia.nextInt();
		
		if(codigoCargo <= 0 || codigoCargo > 6) {
			System.out.println("Código inválido");
		} else {
			System.out.println("Salário: ");
			salario = leia.nextFloat();
			
			switch(codigoCargo) {
				case 1:
					cargo = "Gerente";
					novoSalario = (float) (salario + (salario * 0.10));
					break;
				case 2:
					cargo = "Vendedor";
					novoSalario = (float) (salario + (salario * 0.07));
					break;
				case 3:
					cargo = "Supervisor";
					novoSalario = (float) (salario + (salario * 0.09));
					break;
				case 4:
					cargo = "Motorista";
					novoSalario = (float) (salario + (salario * 0.06));
					break;
				case 5:
					cargo = "Estoquista";
					novoSalario = (float) (salario + (salario * 0.05));
					break;
				case 6:
					cargo = "Técnico de TI";
					novoSalario = (float) (salario + (salario * 0.08));
					break;
				default:
					System.out.println("Opção inválida");
			}
		}
		
		leia.close();
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$"+ novoSalario);
	}
}
