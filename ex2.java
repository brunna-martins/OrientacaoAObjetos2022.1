import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// declarations
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		// instructions
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Soma = " + (a + b));
		System.out.println("Subtra��o = " + (a - b));
		System.out.println("Multiplica��o = " + (a * b));
		System.out.println("Divis�o = " + (a / b));
		System.out.println("Potencia��o = " + (Math.pow(a, b)));
		
	}

}
