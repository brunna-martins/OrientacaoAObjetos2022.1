import javax.swing.JOptionPane;

/*
 * Crie um programa que solicite ao usuário que preencha um vetor de valores inteiros de tamanho x (a ser informado pelo próprio usuário durante a execução do programa). Uma vez que os valores forem lidos e armazenados no vetor, o programa deverá informar ao usuário:
qual a média dos valores lidos;
quantidade de números positivos;
quantidade de números negativos;
quantidade de zeros;
quantidade de números pares;
quantidade de números ímpares.
Para cada um desses casos acima, crie uma função capaz de calcular e retornar as respostas.
 */
public class ex5 {

	public static void main(String[] args) {
		// declaração do vetor
		int vetorInteiros[];
		// instruções
		int x = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores você gostaria de armazenar no seu vetor: "));
		vetorInteiros = new int[x]; // criação do vetor
		for (int i=0;i<x;++i) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser armazenado na posição "+i+" do vetor."));
			JOptionPane.showMessageDialog(null, vetorInteiros[i]);
		}
		float mediaVetor = media(vetorInteiros[],x);
		// JOptionPane.showMessageDialog(null, "A média dos valores armazenados no vetor é "+media(vetorInteiros[],x));
		
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
