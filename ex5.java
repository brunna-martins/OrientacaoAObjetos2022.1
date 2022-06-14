import javax.swing.JOptionPane;

/*
 * Crie um programa que solicite ao usu�rio que preencha um vetor de valores inteiros de tamanho x (a ser informado pelo pr�prio usu�rio durante a execu��o do programa). Uma vez que os valores forem lidos e armazenados no vetor, o programa dever� informar ao usu�rio:
qual a m�dia dos valores lidos;
quantidade de n�meros positivos;
quantidade de n�meros negativos;
quantidade de zeros;
quantidade de n�meros pares;
quantidade de n�meros �mpares.
Para cada um desses casos acima, crie uma fun��o capaz de calcular e retornar as respostas.
 */
public class ex5 {

	public static void main(String[] args) {
		// declara��o do vetor
		int vetorInteiros[];
		// instru��es
		int x = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores voc� gostaria de armazenar no seu vetor: "));
		vetorInteiros = new int[x]; // cria��o do vetor
		for (int i=0;i<x;++i) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser armazenado na posi��o "+i+" do vetor."));
			JOptionPane.showMessageDialog(null, vetorInteiros[i]);
		}
		float mediaVetor = media(vetorInteiros[],x);
		// JOptionPane.showMessageDialog(null, "A m�dia dos valores armazenados no vetor � "+media(vetorInteiros[],x));
		
	}

	public static float media(int vetor[],int tamanhoVetor) {
		int soma = 0;
		
		for (int i=0;i<tamanhoVetor;++i) {
			soma = soma + vetor[i];
		}
		float mediaCalc = (float) (soma/(tamanhoVetor));
		return mediaCalc;
	}
}
