package condicionaisIfSwitch;

import java.util.Scanner;

public class IFexercicio2 {
	public static void main(String args[]) {
		int n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tDigite um número: ");
		n = leia.nextInt();
		
		if(n % 2 == 0 && n > 0) {
			System.out.println("O número " + n + " é par e positivo!");
		} else if(n % 2 != 0 && n < 0) {
			System.out.println("O número " + n + " é ímpar e negativo!");
		} else if (n % 2 == 0 && n < 0){
			System.out.println("O número " + n + " é par e negativo!");
		} else {
			System.out.println("O número " + n + " é ímpar e positivo!");
		}	
		
		leia.close();
	}
}
