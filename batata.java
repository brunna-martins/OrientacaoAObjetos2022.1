import javax.swing.JOptionPane;

public class batata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarações
		int matrizM1[][];
		int matrizM2[][];
		int matrizM3[][];
		matrizM1 = new int[2][2];
		matrizM2 = new int[2][2];
		matrizM3 = new int[2][2];
		
		// instruções
		for (int i = 0;i<2;i++) {
			for (int j = 0;j<2;j++) {
				matrizM1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo "+(i+1)+"x"+(j+1)+"da matriz M1: "));
			}
		}
		
		for (int i = 0;i<2;i++) {
			for (int j = 0;j<2;j++) {
				matrizM2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo "+(i+1)+"x"+(j+1)+"da matriz M2: "));
			}
		}
		
		for (int i=0;i<2;i++) { // i = linhas matrizM3 e j = colunas matrizM3. Vou precisar de outros contadores
			for (int j = 0;j<2;j++) {
				for (int l = 0;l<2;l++) {
					for (int c = 0;c<2;c++) {
						matrizM3[i][j] += matrizM1[l][c]*matrizM2[c][l];
					}
				}
			}
		}
		
		for (int i = 0;i<2;i++) {
			for (int j = 0;j<2;j++) {
				JOptionPane.showMessageDialog(null, matrizM3[i][j]);	
			}
		}
	}
}
