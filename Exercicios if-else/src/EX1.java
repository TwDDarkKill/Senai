import javax.swing.*;
import java.util.ArrayList;

public class EX1 {

	public static void main(String[] args) {
		ArrayList<String> Lista = new ArrayList<String>();
		//teste
		int v1, v2;

		v1 = (int) Double.parseDouble(JOptionPane.showInputDialog
				(null, "Informe o primeiro valor", "Entrada de dados",JOptionPane.DEFAULT_OPTION));

		v2 = (int) Double.parseDouble(JOptionPane.showInputDialog
				(null, "Informe segundo valor", "Entrada de dados",JOptionPane.DEFAULT_OPTION));

		String lhs = null;
		if (v1 > v2) {
			JOptionPane.showMessageDialog
					(null, "O primeiro valor é maior que o segundo!", "Resultado",JOptionPane.INFORMATION_MESSAGE);
			;}
		else if (v1 < v2) {
			JOptionPane.showMessageDialog
					(null, "O segundo valor é maior que o primeiro!", "Resultado",JOptionPane.INFORMATION_MESSAGE);
			;}
		else {
			JOptionPane.showMessageDialog
					(null, "Os valores são iguais!", "Resultado", JOptionPane.INFORMATION_MESSAGE);;
		}
		Lista.add(lhs);
				System.out.printf("Foram realizadas %d consultas",Lista.size());
					for (int i =0; i < Lista.size();i++) {
					System.out.println(Lista.get(i));
				}}}
