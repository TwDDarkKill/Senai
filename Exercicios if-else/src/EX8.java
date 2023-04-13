import javax.swing.*;

public class EX8 {
	//teste
	public static void main(String[] args) {

		double sl, slf = 0, gr, sbr,tx=0;

		sl = Double.parseDouble(JOptionPane.showInputDialog
		(null,"Informe o salario base","Entrada de dados", JOptionPane.INFORMATION_MESSAGE));
		gr = Double.parseDouble(JOptionPane.showInputDialog
		(null,"Informe a gratificação recebida","Entrada de dados",JOptionPane.INFORMATION_MESSAGE));

		sbr = sl + gr;

		if (sbr < 2500) {
			slf = (sbr * 0.90);
			tx = sl-slf;}
		
		else if (sbr > 2500) {
			slf = sbr * 0.85;
			tx = sl-slf;}

		JOptionPane.showInternalMessageDialog
		(null,String.format("\n"+"Salário base : R$ %,2.2f\nGratificação : R$ %,2.2f\n"+"\n"+"Descontos : R$ %,2.2f\n"+"\n"+
		"Salário liquido : R$ %,2.2f",sl,gr,tx,slf),"Resultado", JOptionPane.INFORMATION_MESSAGE);}
}
