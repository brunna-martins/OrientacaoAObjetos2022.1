import javax.swing.JOptionPane;

/*
 * Crie um programa que leia duas Matrizes M1 (M x N) e M2 (O x P) de números inteiros. As dimensões das 
 * matrizes (M, N, O e P) deverão ser informadas pelo usuário. Em seguida o programa deverá verificar se é 
 * possível realizar a multiplicação de M1 por M2. Sendo possível o programa deverá, através de uma chamada 
 * de uma função, calcular a matriz resultante M3 da multiplicação de M1 por M2.
 */

public class ex7 {

	public static void main(String[] args) {
		// declaração das minhas duas matrizes M1 e M2
		int matrizM1[][];
		int matrizM2[][];
		
		// instruções
		int M = Integer.parseInt(JOptionPane.showInputDialog("Seja bem-vinde ao algoritmo de matrizes!\nDigite o número de linhas da matriz M1: "));
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da matriz M1: "));
		int O = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da matriz M2: "));
		int P = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da matriz M2: "));
		
		matrizM1 = new int[M][N];
		matrizM2 = new int[O][P];
		// lendo dados para matrizM1
		for (int i = 0; i<M; i++) {
			for (int j = 0; j<N; j++) {
				matrizM1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para armazenar na posição "+(i+1)+"x"+(j+1)+" da matriz M1: "));
				JOptionPane.showMessageDialog(null, matrizM1[i][j]);
			}
		}
		// lendo dados para matrizM2
		for (int i = 0; i<O; i++) {
			for (int j = 0; j<P; j++) {
				matrizM2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para armazenar na posição "+(i+1)+"x"+(j+1)+" da matriz M2: "));
				JOptionPane.showMessageDialog(null, matrizM2[i][j]);
			}
		}
		
		if (N==O) {
			JOptionPane.showMessageDialog(null,"É possível multiplicar essas matrizes!");
		} else {
			JOptionPane.showMessageDialog(null,"Não é possível multiplicar essas matrizes!");
		}
	}
	
	public static int matrizM3[][](int matriz1[][],int matriz2[][]) {
		
	}

}
