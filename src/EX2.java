import javax.swing.JOptionPane;

public class EX2 {

	public static void main(String[] args) {
			
			int v1,v2,v3;
			
			v1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
			v2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
			v3 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro valor"));
			
			if (v1 > v2 && v1 > v3) {
				JOptionPane.showMessageDialog
				(null,"O primeiro valor é o maior!!","Resultado",JOptionPane.INFORMATION_MESSAGE);
			}else if(v2 > v1 && v2 > v3) {
				JOptionPane.showMessageDialog
				(null,"O segundo valor é o maior!","Resultado",JOptionPane.INFORMATION_MESSAGE);
			}else if(v3 > v1 && v3 > v2){
				JOptionPane.showMessageDialog
				(null,"O terceiro valor é o maior!","Resultado",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog
				(null,"Dois ou mais valores são iguais!","Resultado",JOptionPane.ERROR_MESSAGE);
			}
			
				
		}
}
