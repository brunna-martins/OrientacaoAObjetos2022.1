import java.util.Scanner;
import java.util.Arrays;

/*
 * Um histograma � um gr�fico que representa a freq��ncia que um determinado valor ocorre dentro de um conjunto 
 * de dados. Por exemplo, seja o seguinte conjunto de dados: [4, 2, 5, 2, 3, 1, 4, 5, 2, 2]. O histograma 
 * horizontal para esse conjunto seria o seguinte (considere cada * como uma ocorr�ncia do valor):
1  *
2  ****
3  *
4  **
5  **
Fa�a um programa que leia um conjunto X de valores compreendidos entre [ min, max ], em que min e max 
representam os valores inferior e superior do intervalo. Ao final de sua execu��o o programa dever� imprimir 
o histograma do intervalo.

Desafio: adicione ao programa a funcionalidade de imprimir o histograma vertical. no caso do exemplo acima o 
histograma vertical seria:

  *       
  *       
  *   * * 
* * * * * 
1 2 3 4 5

 * 
 */
public class ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdeValores;
		System.out.print("Digite a quantidade de valores que voc� quer armazenar no vetor: ");
		qtdeValores = sc.nextInt();
		int valores[] = new int[qtdeValores];
		for (int i = 0; i<qtdeValores; i++) {
			System.out.print("Digite o valor a ser armazenado na posi��o "+(i+1)+" do vetor: ");
			valores[i] = sc.nextInt();
		}
		
		Arrays.sort(valores); // essa fun��o da biblioteca java.util.Arrays ordena n�meros e strings
		
		int contFrequencia = 1;
		
		for (int i = 0; i<qtdeValores; i++) {
			contFrequencia = 1;
			for (int j = 0; j<qtdeValores; j++) {
				if (valores[i]==valores[j]) {
					contFrequencia = contFrequencia+1;
				}
			}
			System.out.print(valores[i]+" ");
			for (int k = 1; k<contFrequencia; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		/*for (int i = 0; i<qtdeValores; i++) {
			System.out.print(valores[i]+"\n");
		}*/
		
		
	}

}
