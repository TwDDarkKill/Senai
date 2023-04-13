import javax.swing.*;

public class EX17 {
    //teste
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String cs ;

        String nome = JOptionPane.showInputDialog
        (null, "Insira o nome do aluno", "Entrada de dados",JOptionPane.INFORMATION_MESSAGE);
        double n1 = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Insira a primeira nota", "Entrada de dados",JOptionPane.INFORMATION_MESSAGE));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Insira a segunda nota", "Entrada de dados",JOptionPane.INFORMATION_MESSAGE));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Insira a terceira nota", "Entrada de dados",JOptionPane.INFORMATION_MESSAGE));

        double media = (n1 + n2 + n3) / 3;

        if (media >= 6){
            cs = "Aluno aprovado";
            JOptionPane.showMessageDialog
            (null,String.format("%s\n\nObteve as notas :\n%s | %s | %s\nMédia calculada : %.2f\n\n%s\n",
            nome,n1,n2,n3,media,cs),"Resultado anual",JOptionPane.INFORMATION_MESSAGE);}
        
        else if(media < 6 && media >= 5){
        	cs = "Aluno irá para recuperação";
        	
            JOptionPane.showMessageDialog
            (null,String.format("%s\n\nObteve as notas :\n%s | %s | %s\nMédia calculada : %.2f\n\n%s\n",
            nome,n1,n2,n3,media,cs),"Resultado anual",JOptionPane.INFORMATION_MESSAGE);
        	
        double nr = Double.parseDouble(JOptionPane.showInputDialog
        	(null, "Insira a nota de recuperação", "Entrada de dados",JOptionPane.INFORMATION_MESSAGE));

            double mediarc = (n1 + n2 + n3 + nr) / 4;

            if (mediarc>=6) {cs = "Aluno aprovado";}
        
        else {cs = "Aluno reprovado";}
        	
        JOptionPane.showMessageDialog
        (null,String.format("%s\n\nObteve as notas :\n%s | %s | %s\nNota da recuperação : %s\nMédia calculada : %.2f\n\n%s",
        nome,n1,n2,n3,nr,mediarc,cs),"Resultado anual",JOptionPane.INFORMATION_MESSAGE);}
        
        else {
        	cs = "Aluno reprovado";
            JOptionPane.showMessageDialog
            (null,String.format("%s\n\nObteve as notas :\n%s | %s | %s\nMédia calculada : %.2f\n\n%s\n",
            nome,n1,n2,n3,media,cs),"Resultado anual",JOptionPane.INFORMATION_MESSAGE);}
    }
    }

