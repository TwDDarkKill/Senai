import java.util.Scanner;

import static java.lang.String.format;

public class Calculadora_2 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor : ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o primeiro valor : ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o primeiro valor : ");
        int num2 = scanner.nextInt();

        int resultado=0;

        switch (operador){
            case '+':
                resultado = num1+num2;
                break;
            case '-':
                resultado = num1-num2;
                break;
            case '*':
                resultado = num1*num2;
                break;
            case '/':
                resultado = num1/num2;
                break;
            default:
                System.out.println("Operação invalida");
        }
        System.out.printf(format("O resultado da operação %d %c %d = %d",num1,operador,num2,resultado));
    }

}
