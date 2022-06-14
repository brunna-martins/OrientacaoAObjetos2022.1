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
		}
		double mediaVetor = media(vetorInteiros,x);
		JOptionPane.showMessageDialog(null, "A média dos valores armazenados no vetor é "+mediaVetor+".");
		int quantidadePositivos = positivo(vetorInteiros,x);
		JOptionPane.showMessageDialog(null, "A quantidade de valores positivos armazenados no vetor é "+quantidadePositivos+".");
		int quantidadeNegativos = negativo(vetorInteiros,x);
		JOptionPane.showMessageDialog(null, "A quantidade de valores negativos armazenados no vetor é "+quantidadeNegativos+".");
		int quantidadeZeros = zero(vetorInteiros,x);
		JOptionPane.showMessageDialog(null, "A quantidade de valores nulos armazenados no vetor é "+quantidadeZeros+".");
		int quantidadePares = par(vetorInteiros,x);
		JOptionPane.showMessageDialog(null, "A quantidade de valores pares armazenados no vetor é "+quantidadePares+".");
		int quantidadeImpares = impar(vetorInteiros,x);
		JOptionPane.showMessageDialog(null, "A quantidade de valores ímpares armazenados no vetor é "+quantidadeImpares+".");
	}

	public static double media(int vetor[],int tamanhoVetor) {
		double soma = 0;
		
		for (int i=0;i<tamanhoVetor;++i) {
			soma = soma + vetor[i];
		}
		double mediaCalc = (soma/(tamanhoVetor));
		return mediaCalc;
	}
	
	public static int positivo(int vetor[],int tamanhoVetor) {
		int positivos = 0;
		for (int i=0;i<tamanhoVetor;++i) {
			if (vetor[i]>0) {
				positivos = positivos + 1;
			}
		}
		return positivos;
	}
	
	public static int negativo(int vetor[],int tamanhoVetor) {
		int negativos = 0;
		for (int i=0;i<tamanhoVetor;++i) {
			if (vetor[i]<0) {
				negativos = negativos + 1;
			}
		}
		return negativos;
	}
	
	public static int zero(int vetor[],int tamanhoVetor) {
		int zeros = 0;
		for (int i=0;i<tamanhoVetor;++i) {
			if (vetor[i]==0) {
				zeros = zeros + 1;
			}
		}
		return zeros;
	}
	
	public static int par(int vetor[],int tamanhoVetor) {
		int pares = 0;
		for (int i=0;i<tamanhoVetor;++i) {
			if (vetor[i]%2==0) {
				pares = pares + 1;
			}
		}
		return pares;
	}
	
	public static int impar(int vetor[],int tamanhoVetor) {
		int impares = 0;
		for (int i=0;i<tamanhoVetor;++i) {
			if (vetor[i]%2!=0) {
				impares = impares + 1;
			}
		}
		return impares;
	}
	
}
