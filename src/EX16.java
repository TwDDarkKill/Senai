import javax.swing.JOptionPane;

public class EX16 {
	public static void main(String[] args) {
		int ano, pab = 0;

		ano = Integer.parseInt(JOptionPane.showInputDialog
		(null, "Informe o ano a ser verificado", "Ano Bissexto",JOptionPane.QUESTION_MESSAGE));

		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			JOptionPane.showMessageDialog(null, "O ano de " + ano + " é bissexto");}
		
		else {

			pab = ano + 1;

			while (pab % 4 != 0 || (pab % 100 == 0 && pab % 400 != 0)) 
				pab++;

			JOptionPane.showMessageDialog
			(null,String.format("%s não é uma ano bissexto\nO proximo será em %s",ano,pab,"Verificação concluida"));}
		}
	}
