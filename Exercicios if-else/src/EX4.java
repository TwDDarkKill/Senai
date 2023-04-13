import javax.swing.*;

public class EX4 {
	//teste
	public static void main(String[] args) {
		
		int v1;

		do {
			v1 = Integer.parseInt(JOptionPane.showInputDialog
			(null,"Insira um valor numérico","Entrada de dados",JOptionPane.INFORMATION_MESSAGE));
			

			if (v1 < 1 || v1 > 30) {
				JOptionPane.showMessageDialog
	            (null, "Valor inserido inválido digite novamente","Erro",JOptionPane.ERROR_MESSAGE);}}
		
		while (v1 < 1 || v1 > 30);

		JOptionPane.showMessageDialog
		(null, v1 + " é valido", "Resultado",JOptionPane.INFORMATION_MESSAGE);}

}
