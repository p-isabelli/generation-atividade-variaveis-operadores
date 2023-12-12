package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio03 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> listaInteiros = new HashSet<>();
		int num;
		
		System.out.println("Digite 10 números não repetidos: ");
		for(int i = 0; i < 10; i++) {
			num = leia.nextInt();
			listaInteiros.add(num);			
		}
		
		Iterator<Integer> iListaInteiros = listaInteiros.iterator();
		
		System.out.println("Listar dados do Set: ");
		while (iListaInteiros.hasNext()) {
			System.out.println(iListaInteiros.next());
		}
		
		leia.close();
	}
}
