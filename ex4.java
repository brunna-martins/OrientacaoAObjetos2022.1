import javax.swing.JOptionPane;

/*  ENUNCIADO
 * Crie um programa que seja capaz de ler os dados e calcular o per�metro e a �rea das seguintes figuras geom�tricas: c�rculo, quadrado, ret�ngulo e trap�zio. O usu�rio dever� inicialmente informar qual a figura geom�trica e, a partir de ent�o, os programa dever� ler os dados da figura e calcular seu per�metro e �rea.
Exemplo de utiliza��o:
Escolha a figura geom�trica desejada
1 - Circulo
2 - Quadrado
3 - Ret�ngulo
4 - Trap�zio

Supondo que o usu�rio tenha escolhido a op��o C�rculo, o programa apresenta a seguinte mensagem em seguida:
Informe o raio do c�rculo

Tendo o usu�rio informado 10 como raio do c�rculo, o programa apresentar� em seguida:
O per�metro do c�rculo � 62,8 e a �rea � 314,15.

Para o caso do tri�ngulo, crie uma fun��o que avalie se os lados informados s�o capazes de formar um tri�ngulo. Para tal, as seguintes regras devem ser satisfeitas:
|b-c| < a < b+c
|a-c| < b < a+c
|a-b| < c < a+b
Para o caso do tri�ngulo o programa dever� ainda verificar se os lados formam um tri�ngulo ret�ngulo. Caso sejam lados de um tri�ngulo ret�ngulo, o c�lculo da �rea dever� ser feito atrav�s da f�rmula do Teorema de Pit�goras. Utilize uma fun��o para fazer tal verifica��o e c�lculo.
 */
public class ex4 {

	public static void main(String[] args) {
		// instru��es
		// escolha = um n�mero inteiro para selecionar a op��o que voc� quer no menu.
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Bem-vinde! Digite o n�mero da op��o desejada:\n1-C�rculo\n2-Quadrado\n3-Ret�ngulo\n4-Trap�zio\n5-Tri�ngulo\n"));
		JOptionPane.showMessageDialog(null,escolha);
		switch (escolha) {
		case 1: // circulo
			float raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio do c�rculo: "));
			float perimetroCirculo = (float) (raio*3.14*2);
			float areaCirculo = (float) (raio*raio*3.14);
			JOptionPane.showMessageDialog(null,"O per�metro do c�rculo � "+perimetroCirculo+" e a �rea do c�rculo � "+areaCirculo+".");
			break;
		case 2: // quadrado
			float ladoQuadrado = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado do quadrado: "));
			float perimetroQuadrado = (float) (4*ladoQuadrado);
			float areaQuadrado = (float) (ladoQuadrado*ladoQuadrado);
			JOptionPane.showMessageDialog(null, "O per�metro do quadrado � "+perimetroQuadrado+" e a �rea do quadrado � "+areaQuadrado+".");
			break;
		case 3: // retangulo
			float baseRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do ret�ngulo: "));
			float alturaRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do ret�ngulo: "));
			float perimetroRetangulo = (float) (2*baseRetangulo+2*alturaRetangulo);
			float areaRetangulo = (float) (baseRetangulo*alturaRetangulo);
			JOptionPane.showMessageDialog(null, "O per�metro do ret�ngulo � "+perimetroRetangulo+" e a �rea do ret�ngulo � "+areaRetangulo+".");
			break;
		case 4: // trapezio
			float baseMenor = Float.parseFloat(JOptionPane.showInputDialog("Informe a base menor do trap�zio: "));
			float baseMaior = Float.parseFloat(JOptionPane.showInputDialog("Informe a base maior do trap�zio: "));
			float ladoATrapezio = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado A do trap�zio: "));
			float ladoBTrapezio = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado B do trap�zio: "));
			float alturaTrapezio = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do trap�zio: "));
			float perimetroTrapezio = (float) (ladoATrapezio+ladoBTrapezio+baseMenor+baseMaior);
			float areaTrapezio = (float) (((baseMaior+baseMenor)*alturaTrapezio)/2);
			JOptionPane.showMessageDialog(null, "O per�metro do trap�zio � "+perimetroTrapezio+" e a �rea do trap�zio � "+areaTrapezio+".");
			break;
		case 5: // triangulo
			float ladoATriangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado A do tri�ngulo: "));
			float ladoBTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado B do tri�ngulo: "));
			float ladoCTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado C do tri�ngulo: "));
			boolean trianguloDeFato = ehTriangulo(ladoATriangulo,ladoBTriangulo,ladoCTriangulo);
			if (trianguloDeFato==true) {
				JOptionPane.showMessageDialog(null, "Isso � um tri�ngulo.");
				boolean trigRetangulo = ehTrianguloRetangulo(ladoATriangulo,ladoBTriangulo,ladoCTriangulo);
			} else if (trianguloDeFato==false) {
				JOptionPane.showMessageDialog(null, "Isso n�o � um tri�ngulo.");
			}
			break;
		default: 
			JOptionPane.showMessageDialog(null, "N�mero inv�lido!");
		}
	}
	public static boolean ehTriangulo (float ladoA,float ladoB,float ladoC) { // fun��o pra dizer se dadas 3 medidas, elas formam um tri�ngulo.
		boolean a = ladoA < ladoB + ladoC;
		boolean b = ladoB < ladoA + ladoC;
		boolean c = ladoC < ladoB + ladoC;
		boolean A = ladoA > Math.abs((ladoB-ladoC));
		boolean B = ladoB > Math.abs((ladoA-ladoC));
		boolean C = ladoC > Math.abs((ladoA-ladoB));
		if (a==true && b==true && c==true && A==true && B==true && C==true) {
			boolean trianguloOk = true;
			float perimetroTriangulo = (float) (ladoA+ladoB+ladoC);
			JOptionPane.showMessageDialog(null, "O per�metro do tri�ngulo � "+perimetroTriangulo+".");
			return trianguloOk;
		} else {
			boolean trianguloOk = false;
			return trianguloOk;
		}
	}
	public static boolean ehTrianguloRetangulo (float ladoA,float ladoB,float ladoC) {
		boolean hipA = (ladoA*ladoA == ladoB*ladoB + ladoC*ladoC);
		boolean hipB = (ladoB*ladoB == ladoA*ladoA + ladoC*ladoC);
		boolean hipC = (ladoC*ladoC == ladoA*ladoA + ladoB*ladoB);
		if (hipA==true || hipB==true || hipC==true) {
			JOptionPane.showMessageDialog(null, "O tri�ngulo � ret�ngulo!");
			if (hipA==true) {
				float areaTriang = (ladoB*ladoC)/2;
				JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo � "+areaTriang+".");
			} else if (hipB==true) {
				float areaTriang = (ladoA*ladoC)/2;
				JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo � "+areaTriang+".");
			} else if (hipC==true) {
				float areaTriang = (ladoA*ladoB)/2;
				JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo � "+areaTriang+".");
			}
			boolean trianguloRetangulo = true;
			return trianguloRetangulo;
		} else {
			JOptionPane.showMessageDialog(null, "O tri�ngulo n�o � ret�ngulo!");
			boolean trianguloRetangulo = false;
			return trianguloRetangulo;
		}
	}
}
