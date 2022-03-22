package lista2;

public class P6 {
	public static void main(String[] args) {
		float[] al = new float[100];
		System.out.println("Array de números pares: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
			if(al[i]%2 == 0) {
				System.out.print(" "+ al[i]);
			}

		}
	}

}
