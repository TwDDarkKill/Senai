//Importando classes necessárias
package Calculadora;

import Objetos.CalculosMathematics;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Classe principal
public class Main {
    public static void main(String[] args) {
        //Cria uma instância da classe CalculosMathematics e uma lista para armazenar o histórico de operações
        CalculosMathematics calculosMathematics = new CalculosMathematics();
        ArrayList<String> historico = new ArrayList<>();
        double v1, v2 = 0, resultado; //Declara as variáveis para receber os valores de entrada e o resultado
        char operador; //Declara a variável para receber o operador da operação

        //Loop principal
        while (true) {
            //Cria uma instância do Digitalizador e exibe o menu da calculadora
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    =====Calculadora=====

                    1 - Realizar uma operação
                    2 - Histórico de operações
                    3 - Sair
                    """);
            System.out.print("Digite a opção desejada: ");
            int op = 0;
            try {
                op = scanner.nextInt(); //Lê a opção escolhida pelo usuário
            } catch (InputMismatchException e) { //Trata a exceção caso o usuário digite um valor inválido

                System.out.println("Opção invalida, digite novamente");
                System.out.println(String.format("Erro : %s ", e.getCause()));
                scanner.nextLine(); // esvazia o buffer do Scanner
                continue; // volta para o início do loop
            }

            if (op == 1) { //Caso a opção escolhida seja 1, solicita os valores de entrada e o operador
                System.out.print("Digite o primeiro valor: ");

                try {
                    v1 = scanner.nextInt(); //Lê o primeiro valor
                } catch (InputMismatchException e) { //Trata a exceção caso o usuário digite um valor inválido
                    System.out.printf("Erro: %s\n", e.getCause());
                    scanner.nextLine(); // esvazia o buffer do Scanner
                    continue; // volta para o início do loop
                }

                System.out.print("Digite o operador (+ - * /): ");
                while (true) { //Loop para validar o operador digitado pelo usuário
                    try {
                        operador = scanner.next().charAt(0); //Lê o operador
                        if (operador == '+' || operador == '-' || operador == '*' || operador == '/') { //Verifica se o operador é válido
                            break; //Encerra o loop
                        } else {
                            System.out.println("Erro: operador inválido");
                            System.out.print("Digite o operador (+ - * /): ");
                            // reinicia o loop
                        }
                    } catch (InputMismatchException e) { //Trata a exceção caso o usuário digite um valor inválido
                        System.out.printf("Erro : %s ", e.getCause());
                        System.out.print("Digite o operador (+ - * /): ");
                        scanner.nextLine(); // consome o token inválido
                    }
                }

                System.out.print("Digite o segundo valor: ");

                try {
                    v2 = scanner.nextInt(); //Lê o segundo valor
                } catch (InputMismatchException e) { //Trata a exceção caso o usuário digite um valor inválido
                    System.out.printf("Erro : %s %n", e);
                    scanner.nextLine(); // esvazia o buffer do Scanner

                    switch (operador) { // início do switch, onde é selecionada a operação matemática com base no operador recebido como entrada
                        case '+' ->
                                resultado = calculosMathematics.Soma(v1, v2); // se o operador for uma soma, é realizada a operação de soma e o resultado é armazenado na variável "resultado"
                        case '-' ->
                                resultado = calculosMathematics.Subtrai(v1, v2); // se o operador for uma subtração, é realizada a operação de subtração e o resultado é armazenado na variável "resultado"
                        case '*' ->
                                resultado = calculosMathematics.Multiplica(v1, v2); // se o operador for uma multiplicação, é realizada a operação de multiplicação e o resultado é armazenado na variável "resultado"
                        case '/' -> { // se o operador for uma divisão, é necessário fazer uma verificação adicional
                            if (v2 == 0) { // se o segundo valor for igual a zero, a divisão não pode ser realizada
                                System.out.println("Não é possível realizar uma divisão por zero!");
                                continue; // a instrução "continue" faz com que o programa retorne ao início do loop, ignorando as instruções seguintes
                            } else { // caso contrário, a divisão é realizada e o resultado é armazenado na variável "resultado"
                                resultado = calculosMathematics.Divide(v1, v2);
                            }
                        }
                        default -> { // se o operador não for reconhecido (ou seja, não for uma soma, subtração, multiplicação ou divisão), é executada esta opção
                            System.out.println("Operação inválida!");
                            continue; // a instrução "continue" faz com que o programa retorne ao início do loop, ignorando as instruções seguintes
                        }
                    }

                    // após a operação matemática ser realizada, o resultado é exibido na tela, com os valores de entrada e o operador utilizado
                    System.out.printf("O resultado de %.2f %c %.2f = %.2f\n%n", v1, operador, v2, resultado);

                    // uma string formatada com o histórico da operação é adicionada à lista "historico"
                    String ehs = String.format("%.2f %c %.2f = %.2f\n", v1, operador, v2, resultado);
                    historico.add(ehs);

                    // a seguir, são verificadas as outras opções disponíveis no programa
                    if (op == 2) { // se a entrada for igual a 2, é exibido o histórico de operações realizadas
                        System.out.println("=====Histórico=====\n\n");
                        System.out.printf("Foram realizadas %d operações\n%n", historico.size()); // é exibido o número de operações realizadas
                        for (String s : historico) { // para cada elemento da lista de histórico, é exibida a string formatada com a operação
                            System.out.println(s);
                        }
                    } else if (op == 3) { // se a entrada for igual a 3, o programa é encerrado
                        System.out.println("Encerrando aplicação");
                        System.exit(0); // a instrução "System.exit(0)" encerra a aplicação
                    }
                }
            }
        }
    }
}