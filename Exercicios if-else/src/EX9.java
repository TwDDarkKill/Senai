import javax.swing.*;

public class EX9 {
	//teste
	public static void main(String[] args) {

		double   gr ,ae = 300, sl, slf  , bn  ;

		sl = (int) Double.parseDouble(JOptionPane.showInputDialog
		(null, "Informe o salario base", "", JOptionPane.INFORMATION_MESSAGE));

		if (sl > 2000 && sl <= 3000) {
			slf = sl + (sl * 0.08) + (ae + 50);
			bn = sl * 0.08;
			gr = ae + 50;
		}
		
		else if (sl <= 2000) {
			slf = sl + (sl * 0.10) + (ae+50);
			bn = sl * 0.10;
			gr = ae+50;} else {
			slf = sl + (sl * 0.05) + ae;
			bn = sl * 0.05;
			gr = ae;


		}
		JOptionPane.showMessageDialog(null,String.format("""
				Faixa salarial : R$ %,2.2f
    Gratificação : R$ %,2.2f
    Auxilio família : R$ %,2.2f
    
				Salario liquido : R$ %,2.2f""",sl,bn,gr,slf),"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}
