import javax.swing.JOptionPane;

public class EX14 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int saque =  Integer.parseInt(JOptionPane.showInputDialog
		(null,"Informe o valor que deseja sacar","Saque",JOptionPane.QUESTION_MESSAGE));
		
		int nota100 = saque /100;
		int r100 = saque % 100;

		int nota50 = r100 /50;
		int r50 = r100 % 50;

		int nota20 = r50 /20;
		int r20 = r50 % 20;

		int nota10 = r20 /10;
		int r10 = r20 % 10;

		int nota5 = r10 /5;
		int r5 = r10 % 5;

		int nota2 = r5 /2;
		int r2 = r5 % 2;


		
		JOptionPane.showMessageDialog(null,
	    "Serão necessarias as seguintes cedulas:\n\n"+"Notas de 100 reais - "+nota100
	    +" Cédula(s)"+"\n"+"Notas de 50 reais - "+nota50+" Cédula(s)"+"\n"+
		"Notas de 20 reais - "+nota20+" Cédula(s)"+"\n"+"Notas de 10 reais - "+nota10
		+" Cédula(s)"+"\n"+"Notas de 5 reais - "+nota5
		+" Cédula(s)"+"\n"+"Notas de 2 reais - "+nota2+" Cédula(s)"+"\n\n",
	    "Saque finalizado", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
