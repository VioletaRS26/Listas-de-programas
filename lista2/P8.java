package lista2;
import java.util.Random;
public class P8 {
	public static void main(String[] args) {
		int[] al = new int[100];
		float resultado = 0;
		System.out.println("Array de n�meros �mpares: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
			resultado += al[i];
		}
		System.out.println("A m�dia aritm�tica dos n�meros: "+ resultado);
		System.out.print("A m�dia aritm�tica dos n�meros: "+ resultado/100);
	}

}
