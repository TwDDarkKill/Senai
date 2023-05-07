package Calculadora;

import Objetos.CalculosMathematics;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculosMathematics calculosMathematics = new CalculosMathematics();
        ArrayList<String> historico = new ArrayList<>();
        double v1, v2, resultado;
        char operador;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    =====Calculadora=====

                    1 - Realizar uma operação
                    2 - Histórico de operações
                    3 - Sair
                    """);
            System.out.print("Digite a opção desejada: ");

            int op;
            try {
                op = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.printf("Erro : %s ", e.getCause());
                scanner.nextLine(); // esvazia o buffer do Scanner
                continue; // volta para o início do loop
            }

            if (op == 1) {
                System.out.print("Digite o primeiro valor: ");

                try {
                    v1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.printf("Erro: %s\n", e.getCause());
                    scanner.nextLine(); // esvazia o buffer do Scanner
                    continue; // volta para o início do loop
                }

                System.out.print("Digite o operador (+ - * /): ");
                while (true) {
                    try {
                        operador = scanner.next().charAt(0);
                        if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
                            break;
                        } else {
                            System.out.println("Erro: operador inválido");
                            System.out.print("Digite o operador (+ - * /): ");
                            // reinicia o loop
                        }
                    } catch (InputMismatchException e) {
                        System.out.printf("Erro : %s ", e.getCause());
                        System.out.print("Digite o operador (+ - * /): ");
                        scanner.nextLine(); // consome o token inválido
                    }
                }

                System.out.print("Digite o segundo valor: ");

                try {
                    v2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.printf("Erro : %s %n", e);
                    scanner.nextLine(); // esvazia o buffer do Scanner
                    continue; // volta para o início do loop
                }

                switch (operador) {
                    case '+' -> resultado = calculosMathematics.Soma(v1, v2);
                    case '-' -> resultado = calculosMathematics.Subtrai(v1, v2);
                    case '*' -> resultado = calculosMathematics.Multiplica(v1, v2);
                    case '/' -> {
                        if (v2 == 0) {
                            System.out.println("Não é possível realizar uma divisão por zero!");
                            continue; // volta para o início do loop
                        } else {
                            resultado = calculosMathematics.Divide(v1, v2);
                        }
                    }
                    default -> {
                        System.out.println("Operação inválida!");
                        continue; // volta para o início do loop
                    }
                }
                System.out.printf("O resultado de %.2f %c %.2f = %.2f\n%n", v1, operador, v2, resultado);
                String ehs = String.format("%.2f %c %.2f = %.2f\n", v1, operador, v2, resultado);
                historico.add(ehs);
            } else if (op == 2) {
                System.out.println("=====Histórico=====\n\n");
                System.out.printf("Foram realizadas %d operações\n%n", historico.size());
                for (String s : historico) {
                    System.out.println(s);
                }
            } else if (op == 3) {
                System.out.println("Encerrando aplicação");
                System.exit(0);
            }
        }
    }
}
