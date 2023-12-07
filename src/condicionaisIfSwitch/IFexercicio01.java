package condicionaisIfSwitch;

import java.util.Scanner;

public class IFexercicio01 {
	public static void main(String args[]) {
		int a, b, c, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tDigite o número A: ");
		a = leia.nextInt();
		
		System.out.println("\tDigite o número B: ");
		b = leia.nextInt();
		
		System.out.println("\tDigite o número C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println("\tSoma: " + a + " + " + b + " = " + soma + "\t\nA Soma de A + B é maior do que C");

		} else if(soma < c) {
			System.out.println("\tSoma: " + a + " + " + b + " = " + soma + "\t\nA Soma de A + B é menor do que C");

		} else {
			System.out.println("\tSoma: " + a + " + " + b + " = " + soma + "\t\nA Soma de A + B é igual a C");
		}	
		
		leia.close();
	}
}
