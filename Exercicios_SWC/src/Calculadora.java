package execs;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int v1 = 0,v2 = 0;
        float resultado = 0;
        int menu = 0, menuop = 0;
        String oper = null,resolução = null;


        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog
                    (null,"Selecione a opção desejada\n"+"\n"
                            + "1 - Fechar aplicação\n"
                            + "2 - Realizar outra operação\n"
                            + "3 - Acessar histórico\n"+"\n","Menu de opções",JOptionPane.QUESTION_MESSAGE));

            if (menu <1 || menu >3) {
                JOptionPane.showMessageDialog(null,"Opção digitada invalida, digite novamente","Erro",JOptionPane.ERROR_MESSAGE);
            }

        }while (menu <1 || menu >3);


        switch (menu) {

            case 1:
                JOptionPane.showMessageDialog(null,"Encerrando sistema","Sysinfo",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
            case 2:

                do {

                    menuop = Integer.parseInt(JOptionPane.showInputDialog
                            (null,"Escolha a operação desejada\n"+"\n"
                                    +"1 - Somar\n"
                                    + "2 - Subtrair\n"
                                    + "3 - Multiplicar\n"
                                    + "4 - Dividir"+"\n"+"\n","Calculadora",JOptionPane.QUESTION_MESSAGE));
                    if (menuop <1 || menuop >4) {
                        JOptionPane.showMessageDialog(null,"Opção digitada invalida, digite novamente","Erro",JOptionPane.ERROR_MESSAGE);
                    }}while((menuop <1 || menuop >4));

                if (menuop == 1) {
                    v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor","Soma de valores",JOptionPane.QUESTION_MESSAGE));
                    v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o Segundo valor","Soma de valores",JOptionPane.QUESTION_MESSAGE));
                    resultado = v1 + v2;
                    resolução = "O resultado da soma de";
                    oper = "mais";
                }else if(menuop == 2) {
                    v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor","Subtração de valores",JOptionPane.QUESTION_MESSAGE));
                    v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o Segundo valor","Subtração de valores",JOptionPane.QUESTION_MESSAGE));
                    resultado = v1 - v2;
                    resolução = "O resultado da subtração de";
                    oper = "menos";
                }else if(menuop == 3) {
                    v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor","Multiplicação de valores",JOptionPane.QUESTION_MESSAGE));
                    v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o Segundo valor","Multiplicação de valores",JOptionPane.QUESTION_MESSAGE));
                    resultado = v1 * v2;
                    resolução = "O resultado da multiplicação de";
                    oper = "multiplicado por";
                }else if(menuop == 4) {
                    v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro valor","Divisão de valores",JOptionPane.QUESTION_MESSAGE));
                    v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o Segundo valor","Divisão de valores",JOptionPane.QUESTION_MESSAGE));
                    resultado = v1 / v2;
                    resolução = "O resultado da divisão de";
                    oper = "dividido por";
                }else{
                    JOptionPane.showMessageDialog(null,"Opção digitada invalida");
                }

                JOptionPane.showMessageDialog
                        (null,String.format("%s\n%d %s %d\nÉ igual a %.1f",resolução,v1,oper,v2,resultado),"Resultado",JOptionPane.INFORMATION_MESSAGE);

        }
    }

}
