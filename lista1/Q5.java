package lista1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			float a = 0;
			System.out.println("Digite um n�mero: ");
			a = entrada.nextFloat();
			if(a % 2 == 0) {
				System.out.println("� um n�mero par");
			}else {
				System.out.println("� um n�mero �mpar");
			}
		}
	}
}
