import javax.swing.*;

public class EX10 {
	//teste
	public static void main(String[] args) {
		int imc;
		double peso, a_cm, a_m;
		String classificacao;

		a_cm = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura (Centimetros)"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));

		a_m = a_cm / 100;
		imc = (int) (peso / (a_m * a_m));

		if (imc <= 16) {
			classificacao = "Magreza Severa";
		} else if (imc == 17) {
			classificacao = "Magreza Moderada";
		} else if (imc <= 18.5) {
			classificacao = "Magreza Leve";
		} else if (imc <= 25) {
			classificacao = "Condição Normal";
		} else if (imc <= 30) {
			classificacao = "Obesidade leve";
		} else if (imc <= 40) {
			classificacao = "Obesidade Severa";
		} else {
			classificacao = "Obesidade Mórbida";
		}

		JOptionPane.showMessageDialog(null,
				"Peso  : " + peso + " Quilos" + "\n" + "Altura : " + a_m + " Metros" + "\n" + "IMC Calculado : " + imc
						+ "\n" + "Classificação : " + classificacao,
				"Classificação de IMC", JOptionPane.INFORMATION_MESSAGE);

	}
}
