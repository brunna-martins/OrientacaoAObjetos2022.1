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
		System.out.println("Subtração = " + (a - b));
		System.out.println("Multiplicação = " + (a * b));
		System.out.println("Divisão = " + (a / b));
		System.out.println("Potenciação = " + (Math.pow(a, b)));
		
	}

}
