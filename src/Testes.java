import javax.swing.JOptionPane;
import java.lang.String;

public class Testes {

    public static void main(String[] args) {

        double ae2 = 350.00, ae1 = 300.00, sl, slf=0,slf2=0,slf3=0,bn=0;

        sl = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario base", "",
                JOptionPane.INFORMATION_MESSAGE));

        if (sl < 2000) {
            slf = sl + (sl * 0.10) + ae1;
            bn = sl * 0.10;
            JOptionPane.showMessageDialog(null,String.format(
            "Salario %.2f: R$ " , sl , "\n" 
            + "Salario familia : R$  " , ae2
            +"\n" + "Bonus : R$  " , bn
            +"\n" + "Salário total : R$  %.2f,2f" , slf,
            "Resultado", JOptionPane.INFORMATION_MESSAGE));
        } else if (sl >= 2000 && sl < 2500){
            slf2 = sl + (sl * 0.08) + ae1;
            bn = sl * 0.08;
            JOptionPane.showMessageDialog(null,
            "Salario : R$ " + sl + "\n" 
            + "Salario familia : R$  " + ae2 
            +"\n" + "Bonus : R$  " + bn
            +"\n" + "Salário total : R$  " + slf2,
            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (sl >= 2500) {
            slf3 = sl + (sl * 0.05) + ae1;
            bn = sl * 0.05;
            JOptionPane.showMessageDialog(null,
            "Salario : R$ " + sl + "\n" 
            + "Salario familia : R$  " + ae1 
            +"\n" + "Bonus : R$  " + bn
            +"\n" + "Salário total : R$  " + slf3,
            "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
