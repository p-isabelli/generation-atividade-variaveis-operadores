package condicionaisIfSwitch;

import java.util.Scanner;

public class SWITCHexercicio3 {
	public static void main(String args[]) {
		float numero1 = 0.0f, numero2 = 0.0f, total = 0.0f;
		int operacao;
		String sinal = "";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Operações:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
		
		System.out.println("Selecione a operação desejada: ");
		operacao = leia.nextInt();
		
		if(operacao <= 0 || operacao > 4) {
			System.out.println("Operação inválida");
		} else {
			System.out.println("Número 1: ");
			numero1 = leia.nextFloat();
			
			System.out.println("Número 2: ");
			numero2 = leia.nextFloat();
		
			switch(operacao) {
				case 1:
					total = numero1 + numero2;
					sinal = " + ";
					break;
				case 2:
					total = numero1 - numero2;
					sinal = " - ";
					break;
				case 3:
					total = numero1 * numero2;
					sinal = " * ";
					break;
				case 4:
					total = numero1 / numero2;
					sinal = " / ";
					break;
			}
			
			System.out.println("\n" + numero1 + sinal + numero2 + " = " + total);
		}
		
		
		
		leia.close();
	}
}
