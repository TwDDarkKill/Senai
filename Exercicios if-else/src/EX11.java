import javax.swing.*;
import java.util.ArrayList;

public class EX11 {
	//teste
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String triangulo;
		double x, y, z;

		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro lado (x)"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo lado (y)"));
		z = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do terceiro lado (z)"));

 
            if (x == y && y == z) {
            	triangulo = "Todos os lados são iguais portanto esse é um triangulo equilátero";
            } else if (x == y || y == z || x == z) {
            	triangulo = "Somente dois lados são iguais portanto esse é um triangulo isósceles";
            } else {
    			triangulo = "Todos os lados são diferentes portanto esse é um triangulo escaleno";}


        	JOptionPane.showMessageDialog(null, triangulo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}


