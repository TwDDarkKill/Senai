import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.String.format;

public class Calculadora_2 {

    public static void main(String[]args){
        ArrayList<String> historico = new ArrayList<String>();
        int op = 0,num1 = 0,num2 = 0,resultado = 0;
        char operador = 0;
        while (op != 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("=====Calculadora=====\n\n" +
                    "1 - Realizar um operação\n" +
                    "2 - Histórico de operações\n" +
                    "3 - Sair\n");
            System.out.print("Digite a opção desejada : ");
            op = scanner.nextInt();

            if (op == 1){
                System.out.print("Digite o primeiro valor : ");
                num1 = scanner.nextInt();

                System.out.print("Digite o operador (+ - * /) : ");
                operador = scanner.next().charAt(0);

                System.out.print("Digite o segundo valor : ");
                num2 = scanner.nextInt();

                switch (operador){
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        resultado = num1 / num2;
                        break;
                    default:
                        System.out.print("Operação invalida");
                        System.exit(0);
                        break;
                }
                System.out.println(String.format("O resultado de %d %c %d = %d\n",num1,operador,num2,resultado));
                String ehs = String.format("%d %c %d = %d\n",num1,operador,num2,resultado);
                historico.add(ehs);
            }

           else if (op == 2){
                System.out.println("=====Histórico=====\n\n");
                System.out.println(String.format("Foram realizadas %d operações\n",historico.size()));
                for (int i = 0; i < historico.size(); i++){
                    System.out.println(historico.get(i));
                }
            }
            else if (op == 3){
                System.out.println("Encerrando aplicação");
                System.exit(0);
            }
            else {
                System.out.println("Opção digitada inválida\n");
            }
        }
    }
}
