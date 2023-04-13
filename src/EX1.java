import javax.swing.JOptionPane;

public class EX1 {

	public static void main(String[] args) {

		int v1, v2;

		v1 = (int) Double.parseDouble(JOptionPane.showInputDialog
			(null, "Informe o primeiro valor", "Entrada de dados",JOptionPane.DEFAULT_OPTION));
		
		v2 = (int) Double.parseDouble(JOptionPane.showInputDialog
			(null, "Informe segundo valor", "Entrada de dados",JOptionPane.DEFAULT_OPTION));

		if (v1 > v2) {
			JOptionPane.showMessageDialog
			(null, "O primeiro valor é maior que o segundo!", "Resultado",JOptionPane.INFORMATION_MESSAGE);}

		else if (v1 < v2) {
			JOptionPane.showMessageDialog
			(null, "O segundo valor é maior que o primeiro!", "Resultado",JOptionPane.INFORMATION_MESSAGE);}

		else {
			JOptionPane.showMessageDialog
			(null, "Os valores são iguais!", "Resultado", JOptionPane.INFORMATION_MESSAGE);}
	}
}
