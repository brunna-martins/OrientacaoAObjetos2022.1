import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Crie um programa que leia duas Matrizes M1 (M x N) e M2 (O x P) de números inteiros. As dimensões das 
 * matrizes (M, N, O e P) deverão ser informadas pelo usuário. Em seguida o programa deverá verificar se é 
 * possível realizar a multiplicação de M1 por M2. Sendo possível o programa deverá, através de uma chamada 
 * de uma função, calcular a matriz resultante M3 da multiplicação de M1 por M2.
 */

// refiz tudo fds
// arigatou!! https://www.youtube.com/watch?v=n23lGlklg8s 
// optar pelo console nessa questão é de fato melhor :P

public class ex7 {

	public static void main(String[] args) {
		// leitura do número de linhas e colunas das matrizes M1 e M2
		Scanner sc = new Scanner(System.in);
		int linhaM1;
		int colunaM1;
		int linhaM2;
		int colunaM2;
		
		System.out.print("Informe o número de linhas da matriz M1: ");
		linhaM1 = sc.nextInt();
		System.out.print("");
		
		System.out.print("Informe o número de colunas da matriz M1: ");
		colunaM1 = sc.nextInt();
		System.out.print("");
		
		System.out.print("Informe o número de linhas da matriz M2: ");
		linhaM2 = sc.nextInt();
		System.out.print("");
		
		System.out.print("Informe o número de colunas da matriz M2: ");
		colunaM2 = sc.nextInt();
		System.out.print("");
		
		// criação das matrizes dados os números de linhas e de colunas
		int[][] matrizM1 = new int[linhaM1][colunaM1];
		int[][] matrizM2 = new int[linhaM2][colunaM2];
		
		// leitura de valores para a matrizM1
		for (int i = 0; i < linhaM1; i++) { // contador para linhas
			for (int j = 0; j < colunaM1; j++) { // contador para colunas
				System.out.print("Digite o valor para armazenar na posição "+(i+1)+"x"+(j+1)+" da MatrizM1: ");
				matrizM1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		// leitura de valores para a matrizM2
		for (int i = 0; i < linhaM2; i++) { // contador para linhas
			for (int j = 0; j < colunaM2; j++) { // contador para colunas
				System.out.print("Digite o valor para armazenar na posição "+(i+1)+"x"+(j+1)+" da MatrizM2: ");
				matrizM2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		// impressão das duas matrizes no console
		for (int i = 0; i < linhaM1; i++) { // contador para linhas
			for (int j = 0; j < colunaM1; j++) { // contador para colunas
				System.out.print(matrizM1[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for (int i = 0; i < linhaM2; i++) { // contador para linhas
			for (int j = 0; j < colunaM2; j++) { // contador para colunas
				System.out.print(matrizM2[i][j]+" ");
			}
			System.out.println("");
		}
		
		// verificação se é possível multiplicar as duas matrizes
		if (colunaM1==linhaM2) {
			System.out.print("É possível fazer essa multiplicação!");
			System.out.println("");
			int[][] matrizM3 = new int[linhaM1][colunaM2];
			matrizM3 = matrizMult(matrizM1,matrizM2,linhaM1,colunaM1,linhaM2,colunaM2);
			for (int i = 0; i < linhaM2; i++) { // contador para linhas
				for (int j = 0; j < colunaM2; j++) { // contador para colunas
					System.out.print(matrizM3[i][j]+" ");
				}
				System.out.println("");
			}
		} else {
			System.out.print("Não é possível fazer essa multiplicação!");
		}
	}
	
	// função para cálculo da multiplicação
	public static int[][] matrizMult (int[][] matriz1,int[][] matriz2, int l1, int c1, int l2, int c2) {
		
		int[][] matrizMultiplicao = new int[l1][c2];
		
		for (int i = 0; i<l1; i++) { // percorre linhas da matriz multiplicação
			for (int j = 0; j<c2; j++) { // percorre colunas da matriz multiplicação
				for (int k = 0; k<l2; k++) { // percorre colunas da matrizM1 e linhas da matrizM2
					matrizMultiplicao[i][j] += matriz1[i][k]*matriz2[k][j];
				}
			}
		}
		return matrizMultiplicao;
	}
	
}
