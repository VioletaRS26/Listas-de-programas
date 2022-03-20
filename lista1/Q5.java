package lista1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			float a = 0;
			System.out.println("Digite um número: ");
			a = entrada.nextFloat();
			if(a % 2 == 0) {
				System.out.println("É um número par");
			}else {
				System.out.println("É um número ímpar");
			}
		}
	}
}
