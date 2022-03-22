package lista2;

import java.util.Scanner;

public class P1 {
	public static void main(String[] ars){
		try(Scanner sc = new Scanner(System.in)){
			float quant = 0;
			System.out.println("Insira a quantidade de notas: ");
			quant = sc.nextFloat();
			
			float[] nota = new float[5];
			float media = 0;
			
			for(float i = 0; i < quant; i++){
				System.out.println("Insira uma nota: ");
				nota[(int) (i)]= sc.nextFloat();
				media += nota[(int)(i)];
			}
			System.out.println("A média é: "+ (media/quant));
		}
	}

}
