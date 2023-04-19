import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.String.format;

public class Calculadora_2 {

    public static void main(String[] args) {
        int op = 1,resultado = 0,num1 = 0,num2= 0;
        char operador = 0;

        ArrayList<String> historico = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
                System.out.println("=====Calculadora=====\n" +
                        "1 - Realizar um operação\n" +
                        "2 - Histórico de operações\n" +
                        "3 - Sair");
                op = scanner.nextInt();

                if (op == 1){
                System.out.print("=====Calculadora=====\n");
                System.out.print("Digite o primeiro valor : ");
                num1 = scanner.nextInt();

                System.out.print("Digite o operador (+ - * /) : ");
                operador = scanner.next().charAt(0);

                System.out.print("Digite o segundo valor : ");
                num2 = scanner.nextInt();

                switch (operador) {
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
                        System.out.println("Operação invalida");}
                    //lista = format("O resultado da operação %d %c %d = %d", num1, operador, num2, resultado);
                    System.out.printf(format("O resultado da operação %d %c %d = %d", num1, operador, num2, resultado));
                }
                else if (op == 2){
                   // System.out.println("===========Histórico===========");
                   // System.out.printf("Foram realizadas %d operações",historico.size());
                   // for (int i = 0; i < historico.size() ;i++){
                    //System.out.println(historico.get(i));
                    }
                }}