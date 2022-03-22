package lista2;

public class P5 {
	public static void main(String[] args) {
		float[] al = new float[100];
		System.out.println("Array com números ímpares: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
			if(al[i]%2 == 1) {
				System.out.print(" "+ al[i]);
			}

		}
	}
}
