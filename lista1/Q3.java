package lista1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
		try(Scanner entrada = new Scanner(System.in)){
			float B = 0;
			float b = 0;
			float altura = 0;
			float area = 0;
			System.out.println("Insira a base maior do trap�zio em cm: ");
			B = entrada.nextFloat();
			System.out.println("Insira a base menor do trap�zio em cm: ");
			b = entrada.nextFloat();
			System.out.println("Insira a altura em cm: ");
			altura = entrada.nextFloat();
			area = ((B + b)* altura) /2;
			System.out.printf("A �rea em cm� do trap�zio �: %.2f",area, "cm�");
		}
	}

}
