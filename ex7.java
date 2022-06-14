import javax.swing.JOptionPane;

/*
 * Crie um programa que leia duas Matrizes M1 (M x N) e M2 (O x P) de n�meros inteiros. As dimens�es das 
 * matrizes (M, N, O e P) dever�o ser informadas pelo usu�rio. Em seguida o programa dever� verificar se � 
 * poss�vel realizar a multiplica��o de M1 por M2. Sendo poss�vel o programa dever�, atrav�s de uma chamada 
 * de uma fun��o, calcular a matriz resultante M3 da multiplica��o de M1 por M2.
 */

public class ex7 {

	public static void main(String[] args) {
		// declara��o das minhas duas matrizes M1 e M2
		int matrizM1[][];
		int matrizM2[][];
		
		// instru��es
		int M = Integer.parseInt(JOptionPane.showInputDialog("Seja bem-vinde ao algoritmo de matrizes!\nDigite o n�mero de linhas da matriz M1: "));
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de colunas da matriz M1: "));
		int O = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de linhas da matriz M2: "));
		int P = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de colunas da matriz M2: "));
		
		matrizM1 = new int[M][N];
		matrizM2 = new int[O][P];
		// lendo dados para matrizM1
		for (int i = 0; i<M; i++) {
			for (int j = 0; j<N; j++) {
				matrizM1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para armazenar na posi��o "+(i+1)+"x"+(j+1)+" da matriz M1: "));
				JOptionPane.showMessageDialog(null, matrizM1[i][j]);
			}
		}
		// lendo dados para matrizM2
		for (int i = 0; i<O; i++) {
			for (int j = 0; j<P; j++) {
				matrizM2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para armazenar na posi��o "+(i+1)+"x"+(j+1)+" da matriz M2: "));
				JOptionPane.showMessageDialog(null, matrizM2[i][j]);
			}
		}
		
		if (N==O) {
			JOptionPane.showMessageDialog(null,"� poss�vel multiplicar essas matrizes!");
		} else {
			JOptionPane.showMessageDialog(null,"N�o � poss�vel multiplicar essas matrizes!");
		}
	}
	
	public static int matrizM3[][](int matriz1[][],int matriz2[][]) {
		
	}

}
