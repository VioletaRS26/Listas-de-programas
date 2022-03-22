package lista2;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args){
		int[] num = new int[10];
		int[] m = new int[num.length];
		for(int i = 0; i < num.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira algum número: ");
			num[i] = sc.nextInt();
		}
		System.out.print("Sequência de número inversa: ");
		for(int j = 3; j >= 0; j--) {	
		 System.out.print(" " + num[j]);
		}
	}
}
