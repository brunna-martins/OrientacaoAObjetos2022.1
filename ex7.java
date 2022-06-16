import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Crie um programa que leia duas Matrizes M1 (M x N) e M2 (O x P) de n�meros inteiros. As dimens�es das 
 * matrizes (M, N, O e P) dever�o ser informadas pelo usu�rio. Em seguida o programa dever� verificar se � 
 * poss�vel realizar a multiplica��o de M1 por M2. Sendo poss�vel o programa dever�, atrav�s de uma chamada 
 * de uma fun��o, calcular a matriz resultante M3 da multiplica��o de M1 por M2.
 */

// refiz tudo fds
// arigatou!! https://www.youtube.com/watch?v=n23lGlklg8s 
// optar pelo console nessa quest�o � de fato melhor :P

public class ex7 {

	public static void main(String[] args) {
		// leitura do n�mero de linhas e colunas das matrizes M1 e M2
		Scanner sc = new Scanner(System.in);
		int linhaM1;
		int colunaM1;
		int linhaM2;
		int colunaM2;
		
		System.out.print("Informe o n�mero de linhas da matriz M1: ");
		linhaM1 = sc.nextInt();
		System.out.print("");
		
		System.out.print("Informe o n�mero de colunas da matriz M1: ");
		colunaM1 = sc.nextInt();
		System.out.print("");
		
		System.out.print("Informe o n�mero de linhas da matriz M2: ");
		linhaM2 = sc.nextInt();
		System.out.print("");
		
		System.out.print("Informe o n�mero de colunas da matriz M2: ");
		colunaM2 = sc.nextInt();
		System.out.print("");
		
		// cria��o das matrizes dados os n�meros de linhas e de colunas
		int[][] matrizM1 = new int[linhaM1][colunaM1];
		int[][] matrizM2 = new int[linhaM2][colunaM2];
		
		// leitura de valores para a matrizM1
		for (int i = 0; i < linhaM1; i++) { // contador para linhas
			for (int j = 0; j < colunaM1; j++) { // contador para colunas
				System.out.print("Digite o valor para armazenar na posi��o "+(i+1)+"x"+(j+1)+" da MatrizM1: ");
				matrizM1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		// leitura de valores para a matrizM2
		for (int i = 0; i < linhaM2; i++) { // contador para linhas
			for (int j = 0; j < colunaM2; j++) { // contador para colunas
				System.out.print("Digite o valor para armazenar na posi��o "+(i+1)+"x"+(j+1)+" da MatrizM2: ");
				matrizM2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		// impress�o das duas matrizes no console
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
		
		// verifica��o se � poss�vel multiplicar as duas matrizes
		if (colunaM1==linhaM2) {
			System.out.print("� poss�vel fazer essa multiplica��o!");
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
			System.out.print("N�o � poss�vel fazer essa multiplica��o!");
		}
	}
	
	// fun��o para c�lculo da multiplica��o
	public static int[][] matrizMult (int[][] matriz1,int[][] matriz2, int l1, int c1, int l2, int c2) {
		
		int[][] matrizMultiplicao = new int[l1][c2];
		
		for (int i = 0; i<l1; i++) { // percorre linhas da matriz multiplica��o
			for (int j = 0; j<c2; j++) { // percorre colunas da matriz multiplica��o
				for (int k = 0; k<l2; k++) { // percorre colunas da matrizM1 e linhas da matrizM2
					matrizMultiplicao[i][j] += matriz1[i][k]*matriz2[k][j];
				}
			}
		}
		return matrizMultiplicao;
	}
	
}
