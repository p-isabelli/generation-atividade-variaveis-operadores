package exercicios;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String args[]) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tDigite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\tDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\tSalário: " + salario);
		System.out.println("\tAbono: " + abono);
		System.out.println("\tNovo salário: " + novoSalario);		
	}
}
