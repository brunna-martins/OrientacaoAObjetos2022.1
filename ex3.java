import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		// declarations
		// apparently you don't have to declare our vars beforehand 
		// instructions
		// is a*a = b*b + c*c a true statement?
		String strA = JOptionPane.showInputDialog("Type value for a: ");
		float a = Float.parseFloat(strA);
		String strB = JOptionPane.showInputDialog("Type value for b: ");
		float b = Float.parseFloat(strB);
		String strC = JOptionPane.showInputDialog("Type value for c: ");
		float c = Float.parseFloat(strC);
		JOptionPane.showMessageDialog(null, (a*a == b*b + c*c));
		
	}

}
