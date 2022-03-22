package lista2;
import java.util.Random;
public class P8 {
	public static void main(String[] args) {
		int[] al = new int[100];
		float resultado = 0;
		System.out.println("Array de números ímpares: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
			resultado += al[i];
		}
		System.out.println("A média aritmética dos números: "+ resultado);
		System.out.print("A média aritmética dos números: "+ resultado/100);
	}

}
