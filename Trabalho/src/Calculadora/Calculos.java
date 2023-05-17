package Calculadora;

import Objetos.CalculosMathematics;

import javax.swing.*;
import java.util.ArrayList;

public class Calculos {
    public static void main(String[] args) {
        ArrayList<String> historico = new ArrayList<>();
        double resultado, v1, v2;
        int operador;
        CalculosMathematics calculosMathematics = new CalculosMathematics();
        while (true) {
            int menu = 0;
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        """
                                Escolha a opção desejada

                                1 - Realizar operações
                                2 - Histórico
                                3 - Sair

                                Insira a opção
                                """, "Menu de opções", JOptionPane.PLAIN_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
            }

            switch (menu) {
                case 1 -> {
                    while (true) {
                        try {
                            v1 = Double.parseDouble(JOptionPane.showInputDialog
                                    (null, "Insira o primeiro valor", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                            break;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    while (true) {
                        try {
                            operador = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    """
                                            Escolha a operação
                                                                                        
                                            1 - Soma
                                            2 - Subtração
                                            3 - Multiplicação
                                            4 - Divisão
                                                                                        
                                            Insirá a opção
                                            """, "Operações aritméticas", JOptionPane.QUESTION_MESSAGE));

                            if (operador == 1 || operador == 2 || operador == 3 || operador == 4) { //Verifica se o operador é válido
                                break; //Encerra o loop
                            } else {
                                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira uma operação válida", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    while (true) {
                        try {
                            v2 = Double.parseDouble(JOptionPane.showInputDialog
                                    (null, "Insira o segundo valor", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                            break;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    switch (operador) {
                        case 1 -> {
                            resultado = calculosMathematics.Soma(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("O resultado da soma é %.2f", resultado));
                            historico.add(String.format("%.2f + %.2f = %.2f", v1, v2, resultado));
                        }
                        case 2 -> {
                            resultado = calculosMathematics.Subtrai(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("O resultado da subtração é %.2f", resultado));
                            historico.add(String.format("%.2f - %.2f = %.2f", v1, v2, resultado));
                        }
                        case 3 -> {
                            resultado = calculosMathematics.Multiplica(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("O resultado da multiplicação é %.2f", resultado));
                            historico.add(String.format("%.2f * %.2f = %.2f", v1, v2, resultado));
                        }
                        case 4 -> {
                            if (v2 == 0) {
                                JOptionPane.showMessageDialog(null, "Não é possível realizar uma divisão por zero!");
                            } else {
                                resultado = calculosMathematics.Divide(v1, v2);
                                JOptionPane.showMessageDialog(null, String.format("O resultado da divisão é %.2f", resultado));
                                historico.add(String.format("%.2f / %.2f = %.2f", v1, v2, resultado));
                            }
                        }
                        default ->
                                JOptionPane.showMessageDialog(null, "Erro, operador inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
                case 2 -> {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Histórico\n\n");
                    sb.append(String.format("Foram realizadas %d operações\n\n", historico.size()));
                    for (String s : historico) {
                        sb.append(s);
                        sb.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString(), "Histórico", JOptionPane.PLAIN_MESSAGE);
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Encerrando aplicação", "Finalizando", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            }
        }
    }
}
