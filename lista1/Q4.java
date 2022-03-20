package lista1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			int n = 0;
			System.out.println("Digite um número inteiro: ");
			n = entrada.nextInt();
			int num = 0;
			System.out.println("Digite um número inteiro: ");
			num = entrada.nextInt();
			if (n > num) {
				System.out.println("O maior número inteiro é:"+ n);
			}else {
				System.out.println("O maior número inteiro é: "+ num);
			}
		}
		
	}

}
