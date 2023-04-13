import javax.swing.*;

public class EX7 {
	//teste
	public static void main(String[] args) {
			
			double np1,np2,np3,media,n1,n2,n3,p1=4,p2=2;
		String classif;
			
			String nome = (JOptionPane.showInputDialog
			(null,"Digite o nome do aluno","Entrada de dados",JOptionPane.DEFAULT_OPTION));
			n1 = (int)Double.parseDouble(JOptionPane.showInputDialog
			(null,"Informe a primeira nota","Entrada de dados",JOptionPane.DEFAULT_OPTION));
			n2 = (int)Double.parseDouble(JOptionPane.showInputDialog
			(null,"Informe a segunda nota","Entrada de dados",JOptionPane.DEFAULT_OPTION));
			n3 = (int)Double.parseDouble(JOptionPane.showInputDialog
			(null,"Informe a terceira nota","Entrada de dados",JOptionPane.DEFAULT_OPTION));
			
			if(n1 > n2 && n1 > n3) {
				np1 = (n1*p1);
				np2 = (n2*p2);
				np3 = (n3*p2);}
			
			else if(n2 > n1 && n2 > n3) {
				np1 = (n1*p2);
				np2 = (n2*p1);
				np3 = (n3*p2);}
			
			else {
				np1 = (n1*p2);
				np2 = (n2*p2);
				np3 = (n3*p1);}
		
			media = (np1+np2+np3)/(p1+(p2*2));
		
		if (media>50) {
			classif = "Aluno aprovado!!";
		}else if(media>=45 && media<50) {
			classif = "Aluno recuperação";
		}else {
			classif = "Aluno reprovado";
		}
		
		JOptionPane.showMessageDialog
		(null,String.format("%s"+"\n"+"\n"+"Obteve as notas :"+"\n"+"\n"
		+"%.2f | %.2f | %.2f"+"\n"+"\n"+"Média calculada : %.2f"+"\n"+"\n"+"%s"
		,nome,n1,n2,n3,media,classif));
	}
}
