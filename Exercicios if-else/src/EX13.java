import javax.swing.*;

public class EX13 {
	//teste
	public static void main(String[] args) {

		int hrin, hrf, mnin, mnf;

		String input = JOptionPane.showInputDialog
		(null, "Informe a hora de inicio do jogo (HH:MM)");
		String[] inputArray = input.split(":");
		hrin = Integer.parseInt(inputArray[0].trim());
		mnin = Integer.parseInt(inputArray[1].trim());

		String input1 = JOptionPane.showInputDialog
		(null, "Informe a hora que o jogo acabou (HH:MM)");
		String[] inputArray1 = input1.split(":");
		hrf = Integer.parseInt(inputArray1[0].trim());
		mnf = Integer.parseInt(inputArray1[1].trim());

		int drh = hrf - hrin;
		int drm = mnf - mnin;

		if (drh < 0) {
			drh += 24;
		}

		if (drm < 0) {
			drh--;
			drm += 60;
		}

		JOptionPane.showMessageDialog(null, "A partida teve a duração de "
		+drh+" Horas" + " e "+drm+" Minutos",
		"Final do jogo", JOptionPane.INFORMATION_MESSAGE);

	}
}
