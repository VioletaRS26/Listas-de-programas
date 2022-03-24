package lista3;

public class P3 {
	public static void main(String[] args) {
		int[][] matriz = {{3,4,5},{5,6,1}};
		int[][] matriz2 = {{10,1},{3,5},{0,21}};
		
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
		if(matriz[0].length == matriz2.length) {
			int[][] resultado = new int[2][2];
			for(int i =0; i < matriz.length; i++) {
				for(int j=0; j< matriz2[i].length; j++) {
					for(int k = 0; k < matriz2.length; k++)
					resultado[i][j] += matriz[i][j] *  matriz2[i][j];
					System.out.print( resultado[i][j]+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Não foi possivei realizar a multiplicação!");
		}
	}

}
