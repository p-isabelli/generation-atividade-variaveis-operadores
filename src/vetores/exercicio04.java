package vetores;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		double[][] notas = new double[10][4];
		double[] medias = new double[10];
		
		System.out.println("Insira as notas abaixo ");
		
		 for (int i = 0; i < 10; i++) {
	         System.out.println("Participante " + (i + 1));
	         for (int j = 0; j < 4; j++) {
		         System.out.print("Nota do bimestre " + (j + 1) + ": ");
		         notas[i][j] = leia.nextDouble();
	         }
	     }
		 

	     for (int i = 0; i < 10; i++) {
	         double soma = 0;
	         for (int j = 0; j < 4; j++) {
	             soma += notas[i][j];
	         }
	         medias[i] = soma / 4; 
	     }
	     
	     System.out.println("\nMédias dos participantes:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }	
	        
	     leia.close();
	 }
}
