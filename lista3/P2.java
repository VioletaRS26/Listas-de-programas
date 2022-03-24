package lista3;

public class P2 {
	public static void main(String[] args) {
		int[][] matriz = {{3,4,5},{5,6,1},{7,8,2}};
		int[][] matriz2 = {{10,1,2},{3,5,0},{0,21,15}};
		int[][] resultado = new int[3][3];
		
		System.out.println("Matriz 1: ");
		for(int i=0; i< matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(" "+ matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matriz 2: ");
		for(int i=0; i< matriz2.length; i++) {
			for(int j = 0; j < matriz2[i].length; j++) {
				System.out.print(" "+ matriz2[i][j]);
			}
			System.out.println();
		}
		System.out.println("Resultado da subtração das matrizes: ");
		for(int i =0; i < resultado.length; i++) {
			for(int j=0; j< resultado[i].length; j++) {
				resultado[i][j] = matriz[i][j] - matriz2[i][j];
				System.out.print( resultado[i][j]+" ");
			}
			System.out.println();
		}
	}

}
