import javax.swing.JOptionPane;

public class EX15 {
	public static void main(String[] args) {

		String p1 = JOptionPane.showInputDialog(null, "Insira a primeira palavra");
		String p2 = JOptionPane.showInputDialog(null, "Insira a segunda palavra");

		JOptionPane.showMessageDialog
		(null, "Primeira palavra : " + p1 + "\n" + "Segunda palavra : "
		+ p2, "Resultado",JOptionPane.INFORMATION_MESSAGE);

		String temp = p1;
		p1 = p2;
		p2 = temp;

		JOptionPane.showMessageDialog
		(null, "Primeira palavra : " + p1 + "\n" + "Segunda palavra : "
		+ p2, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}
