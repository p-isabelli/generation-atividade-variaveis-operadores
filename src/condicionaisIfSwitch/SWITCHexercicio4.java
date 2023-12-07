package condicionaisIfSwitch;

import java.util.Scanner;

public class SWITCHexercicio4 {
	public static void main(String args[]) {
		float saldo = (float) 1000.00, saque = 0.0f, deposito = 0.0f;
		int operacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha uma opção:\n1 - Saldo\n2 - Saque\n3 - Depósito\n");
		operacao = leia.nextInt();
		
		if(operacao <= 0 || operacao > 3) {
			System.out.println("Opção inválida");
		} else {
			switch(operacao) {
				case 1:
					System.out.println("Saldo: " + saldo);
					break;
				case 2:
					System.out.println("Valor: ");
					saque = leia.nextFloat();
					if(saldo >= saque) {
						saldo -= saque;
						System.out.println("Novo Saldo: R$ " + saldo);
					} else {
						System.out.println("Saldo insuficiente!");
					}
					break;
				case 3:
					System.out.println("Valor: ");
					deposito = leia.nextFloat();
					saldo += deposito;
					System.out.println("Novo Saldo: R$ " + saldo);
					break;
				default:
					System.out.println("Opção inválida");
			}
		}
		
		leia.close();
	}
}
