package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<String> listaDeCores = new ArrayList<String>();
		
		System.out.println("Insira uma cor: ");
		
		for(int i = 0; i < 5; i++) {
			listaDeCores.add(leia.next());			
		}
		
		Collections.sort(listaDeCores);
		
		System.out.println("Cores cadastradas: ");
		
		for(String cor : listaDeCores) {
			System.out.println(cor);
		}
		
		leia.close();	
	}

}
