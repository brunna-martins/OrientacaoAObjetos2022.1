import javax.swing.JOptionPane;

/*  ENUNCIADO
 * Crie um programa que seja capaz de ler os dados e calcular o perímetro e a área das seguintes figuras geométricas: círculo, quadrado, retângulo e trapézio. O usuário deverá inicialmente informar qual a figura geométrica e, a partir de então, os programa deverá ler os dados da figura e calcular seu perímetro e área.
Exemplo de utilização:
Escolha a figura geométrica desejada
1 - Circulo
2 - Quadrado
3 - Retângulo
4 - Trapézio

Supondo que o usuário tenha escolhido a opção Círculo, o programa apresenta a seguinte mensagem em seguida:
Informe o raio do círculo

Tendo o usuário informado 10 como raio do círculo, o programa apresentará em seguida:
O perímetro do círculo é 62,8 e a área é 314,15.

Para o caso do triângulo, crie uma função que avalie se os lados informados são capazes de formar um triângulo. Para tal, as seguintes regras devem ser satisfeitas:
|b-c| < a < b+c
|a-c| < b < a+c
|a-b| < c < a+b
Para o caso do triângulo o programa deverá ainda verificar se os lados formam um triângulo retângulo. Caso sejam lados de um triângulo retângulo, o cálculo da área deverá ser feito através da fórmula do Teorema de Pitágoras. Utilize uma função para fazer tal verificação e cálculo.
 */
public class ex4 {

	public static void main(String[] args) {
		// instruções
		// escolha = um número inteiro para selecionar a opção que você quer no menu.
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Bem-vinde! Digite o número da opção desejada:\n1-Círculo\n2-Quadrado\n3-Retângulo\n4-Trapézio\n5-Triângulo\n"));
		JOptionPane.showMessageDialog(null,escolha);
		switch (escolha) {
		case 1: // circulo
			float raio = Float.parseFloat(JOptionPane.showInputDialog("Informe o raio do círculo: "));
			float perimetroCirculo = (float) (raio*3.14*2);
			float areaCirculo = (float) (raio*raio*3.14);
			JOptionPane.showMessageDialog(null,"O perímetro do círculo é "+perimetroCirculo+" e a área do círculo é "+areaCirculo+".");
			break;
		case 2: // quadrado
			float ladoQuadrado = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado do quadrado: "));
			float perimetroQuadrado = (float) (4*ladoQuadrado);
			float areaQuadrado = (float) (ladoQuadrado*ladoQuadrado);
			JOptionPane.showMessageDialog(null, "O perímetro do quadrado é "+perimetroQuadrado+" e a área do quadrado é "+areaQuadrado+".");
			break;
		case 3: // retangulo
			float baseRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe a base do retângulo: "));
			float alturaRetangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do retângulo: "));
			float perimetroRetangulo = (float) (2*baseRetangulo+2*alturaRetangulo);
			float areaRetangulo = (float) (baseRetangulo*alturaRetangulo);
			JOptionPane.showMessageDialog(null, "O perímetro do retângulo é "+perimetroRetangulo+" e a área do retângulo é "+areaRetangulo+".");
			break;
		case 4: // trapezio
			float baseMenor = Float.parseFloat(JOptionPane.showInputDialog("Informe a base menor do trapézio: "));
			float baseMaior = Float.parseFloat(JOptionPane.showInputDialog("Informe a base maior do trapézio: "));
			float ladoATrapezio = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado A do trapézio: "));
			float ladoBTrapezio = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado B do trapézio: "));
			float alturaTrapezio = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura do trapézio: "));
			float perimetroTrapezio = (float) (ladoATrapezio+ladoBTrapezio+baseMenor+baseMaior);
			float areaTrapezio = (float) (((baseMaior+baseMenor)*alturaTrapezio)/2);
			JOptionPane.showMessageDialog(null, "O perímetro do trapézio é "+perimetroTrapezio+" e a área do trapézio é "+areaTrapezio+".");
			break;
		case 5: // triangulo
			float ladoATriangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado A do triângulo: "));
			float ladoBTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado B do triângulo: "));
			float ladoCTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Informe o lado C do triângulo: "));
			boolean trianguloDeFato = ehTriangulo(ladoATriangulo,ladoBTriangulo,ladoCTriangulo);
			if (trianguloDeFato==true) {
				JOptionPane.showMessageDialog(null, "Isso é um triângulo.");
				boolean trigRetangulo = ehTrianguloRetangulo(ladoATriangulo,ladoBTriangulo,ladoCTriangulo);
			} else if (trianguloDeFato==false) {
				JOptionPane.showMessageDialog(null, "Isso não é um triângulo.");
			}
			break;
		default: 
			JOptionPane.showMessageDialog(null, "Número inválido!");
		}
	}
	public static boolean ehTriangulo (float ladoA,float ladoB,float ladoC) { // função pra dizer se dadas 3 medidas, elas formam um triângulo.
		boolean a = ladoA < ladoB + ladoC;
		boolean b = ladoB < ladoA + ladoC;
		boolean c = ladoC < ladoB + ladoC;
		boolean A = ladoA > Math.abs((ladoB-ladoC));
		boolean B = ladoB > Math.abs((ladoA-ladoC));
		boolean C = ladoC > Math.abs((ladoA-ladoB));
		if (a==true && b==true && c==true && A==true && B==true && C==true) {
			boolean trianguloOk = true;
			float perimetroTriangulo = (float) (ladoA+ladoB+ladoC);
			JOptionPane.showMessageDialog(null, "O perímetro do triângulo é "+perimetroTriangulo+".");
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
			JOptionPane.showMessageDialog(null, "O triângulo é retângulo!");
			if (hipA==true) {
				float areaTriang = (ladoB*ladoC)/2;
				JOptionPane.showMessageDialog(null, "A área do triângulo é "+areaTriang+".");
			} else if (hipB==true) {
				float areaTriang = (ladoA*ladoC)/2;
				JOptionPane.showMessageDialog(null, "A área do triângulo é "+areaTriang+".");
			} else if (hipC==true) {
				float areaTriang = (ladoA*ladoB)/2;
				JOptionPane.showMessageDialog(null, "A área do triângulo é "+areaTriang+".");
			}
			boolean trianguloRetangulo = true;
			return trianguloRetangulo;
		} else {
			JOptionPane.showMessageDialog(null, "O triângulo não é retângulo!");
			boolean trianguloRetangulo = false;
			return trianguloRetangulo;
		}
	}
}
