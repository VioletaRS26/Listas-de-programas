package lista2;

public class P4 {
	public static void main(String[] args) {
		int[] al = new int[100];
		
		System.out.println("Array de n�meros �mpares: ");
		for(int i = 0; i < 100; i++) {
			al[i] = (int)(Math.random()* 100);
		}
		boolean primo;
		for(int i = 0; i < al.length; i++) {
			int num = al[i];
			if(num == 1) {
				System.out.println("O n�mero � 1");
			}else {
				primo = true;
				for(int divisor = 2; divisor < num ; divisor++) {
					if(num % divisor == 0) {
						primo = false;
					}
				}
				if(primo) {
					System.out.println("O n�mero "+ num +" � primo!");
				}
			}
		}
	}
}
