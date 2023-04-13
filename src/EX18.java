import javax.swing.*;

public class EX18 {
	//teste
	public static void main(String[] args) {

		double n1,n2,n3,n4,media;
		int presenca;
		String premio;

		
		String nome = JOptionPane.showInputDialog
		(null,"Insira o nome do aluno","Nome do aluno",JOptionPane.QUESTION_MESSAGE);
		n1 =  Integer.parseInt(JOptionPane.showInputDialog
		(null,"Insira a primeira nota","Notas",JOptionPane.QUESTION_MESSAGE));
		n2 =  Integer.parseInt(JOptionPane.showInputDialog
		(null,"Insira a segunda nota","Notas",JOptionPane.QUESTION_MESSAGE));
		n3 =  Integer.parseInt(JOptionPane.showInputDialog
		(null,"Insira a terceira nota","Notas",JOptionPane.QUESTION_MESSAGE));
		n4 =  Integer.parseInt(JOptionPane.showInputDialog
		(null,"Insira a quarta nota","Notas",JOptionPane.QUESTION_MESSAGE));
		presenca = Integer.parseInt(JOptionPane.showInputDialog
		(null,"Insira a porcentagem de presença","Notas",JOptionPane.QUESTION_MESSAGE));
		
		media = (n1+n2+n3+n4)/4;

		if (media >= 80 && presenca==100) {
			premio = "Premio : Parabéns, você ganhou uma excursão";
			JOptionPane.showMessageDialog
			(null,String.format("""
							%s
	
							Obteve as notas
							%s | %s | %s | %s
	
							Média calculada : %s
							Percentual de presença : %s
	
							%s""",nome,n1,n2,n3,n4,media,presenca,premio)
			,"Resultado final",JOptionPane.PLAIN_MESSAGE);
		}
		
		else {
			if (media >= 80 && presenca < 100) {
				premio = "Parabéns, você ganhou uma camiseta";}
			else if (media >= 70 && media < 80 && presenca == 100) {
				premio = "Parabéns, você ganhou uma squeeze";}
			else if (media >=70 || presenca == 100) {
				premio = "Parabéns, você ganhou uma caneta personalizada";}

			else premio = "Aluno não obteve os requisitos para premiação";
			JOptionPane.showMessageDialog
			(null,String.format("""
							%s
	
							Obteve as notas
							%s | %s | %s | %s
	
							Média calculada : %s
							Percentual de presença : %s
	
							%s""",nome,n1,n2,n3,n4,media,presenca,premio)
			,"Resultado final",JOptionPane.PLAIN_MESSAGE);
		}

	}
}
