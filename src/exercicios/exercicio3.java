package exercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String args[]) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tInsira o salário bruto: ");
		salarioBruto = leia.nextFloat();	
		
		System.out.println("\tInsira o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();	
		

		System.out.println("\tInsira as horas extras: ");
		horasExtras = leia.nextFloat();	
		

		System.out.println("\tInsira os descontos: ");
		descontos = leia.nextFloat();	
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\tSalário líquido: %.2f", salarioLiquido);
	}
}
