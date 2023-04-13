import javax.swing.*;

public class EX3 {

	public static void main(String[] args) {
		//teste
			double n1,n2,n3,n4,media;
			String classif = null;
			
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
			
		media = (n1+n2+n3+n4)/4;
		
		if (media<=20) {classif = "Resultado péssimo";}
		else if(media>20 && media<40){classif = "Resultado ruim";}
		else if(media>=40 && media<60){classif = "Resultado regular";}
		else if(media>=60 && media<80){classif = "Resultado bom";}
		else if(media>=80){classif = "Resultado ótimo";}

		JOptionPane.showMessageDialog
		(null,String.format("%s"+"\n"+"\n"+"Obteve as notas :\n%.2f | %.2f | %.2f | %.2f\n"+
		"\n"+"Média calculada : %.2f"+"\n"+"\n"+"%s",nome,n1,n2,n3,n4,media,classif),
		"Resultado final",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
