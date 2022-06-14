import javax.swing.JOptionPane;
import java.text.Normalizer;
import java.util.regex.Pattern;

/*
 * Um pal�ndromo � uma palavra ou texto que pode ser lido tanto da esquerda para a direita quanto da direita 
 * para a esquerda. Exemplos: ovo, arara, "Socorram-me subi no onibus em Marrocos", anilina, "amor a roma", etc.
 * Crie um programa capaz de ler uma String e informar se ela � um pal�ndromo ou n�o.
 */

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ehPalindromo = JOptionPane.showInputDialog("Digite uma string qualquer para conferir se ela forma um pal�ndromo ou n�o: ");
		String palindromo = "";
		ehPalindromo = ehPalindromo.replace(" ","");
		ehPalindromo = ehPalindromo.replace(",","");
		ehPalindromo = ehPalindromo.replace("!","");
		ehPalindromo = ehPalindromo.replace(".","");
		ehPalindromo = ehPalindromo.replace("?","");
		ehPalindromo = ehPalindromo.replace("-","");
		ehPalindromo = ehPalindromo.replace("_","");
		ehPalindromo = ehPalindromo.replace(":","");
		ehPalindromo = ehPalindromo.replace(";","");
		ehPalindromo = ehPalindromo.toLowerCase();
		ehPalindromo = removerAcentos(ehPalindromo);
		System.out.println(ehPalindromo);
		for (int i = (ehPalindromo.length()-1);i>=0;i--) {
			palindromo = palindromo + ehPalindromo.charAt(i);
		}
		// agradecimentos �s dicas obtidas em: https://www.guj.com.br/t/resolvido-palindromos/379442
		System.out.println(palindromo);
		if (palindromo.equals(ehPalindromo)==true) {
			JOptionPane.showMessageDialog(null, "� um pal�ndromo.");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � um pal�ndromo.");
		}
	}
	
	// meus agradecimentos aos autores dessa fun��o de remover acentos!
	// https://pt.stackoverflow.com/questions/42/como-remover-acentos-e-outros-sinais-gr%C3%A1ficos-de-uma-string-em-java
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

}
