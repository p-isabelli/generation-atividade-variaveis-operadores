package condicionaisIfSwitch;

import java.util.Scanner;

public class IFexercicio4 {
	public static void main(String args[]) {
        String tipo, animal, alimentacao;

        Scanner leia = new Scanner(System.in);

        System.out.println("Selecione uma opção: \n1-Vertebrado\n2-Invertebrado");
        tipo = leia.nextLine();

        if (tipo.equals("1")) {
            System.out.println("Selecione uma opção: \n1-Ave\n2-Mamífero");
            animal = leia.nextLine();

            if (animal.equals("1")) {
                System.out.println("Selecione uma opção: \n1-Carnívoro\n2-Onívoro");
                alimentacao = leia.nextLine();

                if (alimentacao.equals("1")) {
                    System.out.println("Águia");
                } else if (alimentacao.equals("2")) {
                    System.out.println("Pomba");
                } else {
                    System.out.println("Opção inválida");
                }

            } else if (animal.equals("2")) {
                System.out.println("Selecione uma opção: \n1-Onívoro\n2-Herbívoro");
                alimentacao = leia.nextLine();

                if (alimentacao.equals("1")) {
                    System.out.println("Homem");
                } else if (alimentacao.equals("2")) {
                    System.out.println("Vaca");
                } else {
                    System.out.println("Opção inválida");
                }
            }
        } else if (tipo.equals("2")) {
            System.out.println("Selecione uma opção: \n1-Inseto\n2-Anelídeo");
            animal = leia.nextLine();

            if (animal.equals("1")) {
                System.out.println("Selecione uma opção: \n1-Hematófago\n2-Herbívoro");
                alimentacao = leia.nextLine();

                if (alimentacao.equals("1")) {
                    System.out.println("Pulga");
                } else if (alimentacao.equals("2")) {
                    System.out.println("Lagarta");
                } else {
                    System.out.println("Opção inválida");
                }

            } else if (animal.equals("2")) {
                System.out.println("Selecione uma opção: \n1-Hematófago\n2-Onívoro");
                alimentacao = leia.nextLine();

                if (alimentacao.equals("1")) {
                    System.out.println("Sanguessuga");
                } else if (alimentacao.equals("2")) {
                    System.out.println("Minhoca");
                } else {
                    System.out.println("Opção inválida");
                }
            }
        }

 
        leia.close(); 
	}
}
