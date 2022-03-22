package lista2;
import java.util.Random;

public class P7 {
	public static void main(String[] args) {
		int[] al = new int[100];
		int maior=0, menor =1000000, aux;
		System.out.println("Array: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
			aux = al[i];
			System.out.print(" "+al[i]);
			if(menor > aux) {
				menor = al[i];
			}
			if(maior < aux) {
				maior = al[i];
			}
		}
		System.out.println();
		System.out.println("Maior número do array: "+ maior);
		System.out.print("Menor número do array: "+ menor);
	}

}
