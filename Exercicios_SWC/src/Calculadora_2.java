import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora_2 {

    public static void main(String[] args) {
        ArrayList<String> historico = new ArrayList<>();
        int op, num1, num2, resultado;
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

            try {
                op = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Digite um número inteiro válido.");
                scanner.next(); // esvazia o buffer do Scanner
                continue; // volta para o início do loop
            }

            if (op == 1) {
                System.out.print("Digite o primeiro valor: ");

                try {
                    num1 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número inteiro válido.");
                    scanner.next(); // esvazia o buffer do Scanner
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
                        System.out.println("Erro: operador inválido");
                        System.out.print("Digite o operador (+ - * /): ");
                        scanner.next(); // consome o token inválido
                        // reinicia o loop
                    }
                }

                System.out.print("Digite o segundo valor: ");

                try {
                    num2 = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido! Digite um número inteiro válido.");
                    scanner.next(); // esvazia o buffer do Scanner
                    continue; // volta para o início do loop
                }

                switch (operador) {
                    case '+' -> resultado = num1 + num2;
                    case '-' -> resultado = num1 - num2;
                    case '*' -> resultado = num1 * num2;
                    case '/' -> {
                        if (num2 == 0) {
                            System.out.println("Não é possível realizar uma divisão por zero!");
                            continue; // volta para o início do loop
                        } else {
                            resultado = num1 / num2;
                        }
                    }
                    default -> {
                        System.out.println("Operação inválida!");
                        continue; // volta para o início do loop
                    }
                }
                System.out.printf("O resultado de %d %c %d = %d\n%n", num1, operador, num2, resultado);
                String ehs = String.format("%d %c %d = %d\n", num1, operador, num2, resultado);
                historico.add(ehs);
            }

            else if (op == 2) {
                System.out.println("=====Histórico=====\n\n");
                System.out.printf("Foram realizadas %d operações\n%n", historico.size());
                for (String s : historico) {
                    System.out.println(s);
                }
            } else if (op == 3) {
                System.out.println("Encerrando aplicação");
                System.exit(0);
            } else {
                System.out.println("Opção digitada inválida!\n");
            }
        }
    }
}