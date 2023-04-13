import javax.swing.JOptionPane;

public class EX6 {
	public static void main(String[] args) {

		double pi, pm = 0.75, pf = 0.67, ai = 1.524, a_cm, a_m;

		String sexo = JOptionPane.showInputDialog
		(null, "Informe o seu genero (M | F)");
		
		a_cm = Integer.parseInt(JOptionPane.showInputDialog
		(null, "Informe sua altura em centimetros",
		"Altura",JOptionPane.INFORMATION_MESSAGE));

		a_m = a_cm / 100;

		if (sexo.equals("M")) {
			pi = ((pm * (a_m - ai) * 100) + 52);
			JOptionPane.showMessageDialog
			(null,String.format("Sua altura atual : %.2f Metros\nPeso ideal : %.2fkg", a_m, pi),
			"Resultado",JOptionPane.INFORMATION_MESSAGE);}
		
		else if (sexo.equals("F")) {
			pi = ((pf * (a_m - ai) * 100) + 52);
			JOptionPane.showMessageDialog
			(null,String.format("Sua altura atual : %.2f Metros\nPeso ideal : %.2fkg", a_m, pi),
			"Resultado",JOptionPane.INFORMATION_MESSAGE);}
	}

}
