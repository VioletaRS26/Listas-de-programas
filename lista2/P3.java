package lista2;
import java.util.Random;
import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		float[] al = new float[100];
		System.out.println("Array: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
			System.out.print(" "+ al[i]);
		}
		System.out.println();
		System.out.println("Inverso do array: ");
		for(int j = 99; j>= 0; j--) {
			System.out.print(" "+ al[j]);
		}
	}

}
