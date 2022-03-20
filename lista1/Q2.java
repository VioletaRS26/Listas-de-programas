package lista1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			float peso = 0;
			float altura = 0;
			float imc = 0;
			System.out.println("Insira o peso: ");
			peso = sc.nextFloat();
			System.out.println("Insira a altura: ");
			altura = sc.nextFloat();
			imc = peso/ (altura * altura);
			System.out.printf("O seu IMC é:%.2f", imc);
		}
	}

}
