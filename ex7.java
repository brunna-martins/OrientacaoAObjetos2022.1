import javax.swing.JOptionPane;

/*
 * Crie um programa que leia duas Matrizes M1 (M x N) e M2 (O x P) de n�meros inteiros. As dimens�es das 
 * matrizes (M, N, O e P) dever�o ser informadas pelo usu�rio. Em seguida o programa dever� verificar se � 
 * poss�vel realizar a multiplica��o de M1 por M2. Sendo poss�vel o programa dever�, atrav�s de uma chamada 
 * de uma fun��o, calcular a matriz resultante M3 da multiplica��o de M1 por M2.
 */

// nem ideia do que est� dando de errado na multiplica��o da Matriz :///

public class ex7 {

	public static void main(String[] args) {
		// declara��o das minhas duas matrizes M1 e M2
		int matrizM1[][];
		int matrizM2[][];
		// matriz resultado de multiplica��o, se for poss�vel
		int matrizM3[][];
		
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
				//JOptionPane.showMessageDialog(null, matrizM1[i][j]);
			}
		}
		// lendo dados para matrizM2
		for (int i = 0; i<O; i++) {
			for (int j = 0; j<P; j++) {
				matrizM2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para armazenar na posi��o "+(i+1)+"x"+(j+1)+" da matriz M2: "));
				//JOptionPane.showMessageDialog(null, matrizM2[i][j]);
			}
		}
		
		if (N==O) {
			JOptionPane.showMessageDialog(null,"� poss�vel multiplicar essas matrizes!");
			matrizM3 = new int[M][P];
			matrizM3 = resultMult(matrizM1,matrizM2,M,N,O,P);
			JOptionPane.showMessageDialog(null, matrizM3);
			/*for (int i = 0; i<M; i++) {
				for (int j = 0; j<P; j++) {
					matrizM3[i][j] = resultMult(matrizM1,matrizM2,i,j,N,O,M,P);
					JOptionPane.showMessageDialog(null, matrizM3[i][j]);
				}
			}*/
			
		} else {
			JOptionPane.showMessageDialog(null,"N�o � poss�vel multiplicar essas matrizes!");
		}
	}
	
	public static int[][] resultMult(int matriz1[][],int matriz2[][],int lin1,int col1,int lin2,int col2) {
		int matrizResult[][];
		matrizResult = new int[col1][lin2];
		for (int i = 0; i<col1; i++) {
			for (int j = 0; j<lin2; j++) {
				for (int a = 0; a<col1; a++) {
					for (int b = 0; b<lin2; b++) {
						matrizResult[i][j] = matriz1[i][a]*matriz2[b][j];
					}
				}
				
			}
		}
		
		return new int[col1][lin2];
	}

}
