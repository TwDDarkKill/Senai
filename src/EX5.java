import javax.swing.*;

public class EX5 {
	//teste
	public static void main(String[] args) {

		int v1, v2, v3;

		v1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		v2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		v3 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro valor"));

		if (v3 > v1 && v3 < v2) {
			JOptionPane.showMessageDialog
			(null, "O terceiro valor informado está entre os dois primeiros",
			"Resultado",JOptionPane.INFORMATION_MESSAGE);} 
		else {
			JOptionPane.showMessageDialog
			(null, "O terceiro valor informado não está entre os dois primeiros",
			"Resultado", JOptionPane.INFORMATION_MESSAGE);}

	}

}
