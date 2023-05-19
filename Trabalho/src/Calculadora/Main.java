package calculadora;

import Objetos.CalculosMathematics;

import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> historico = new ArrayList<>();
        double resultado = 0, v1 = 0, v2 = 0;
        int operador = 0;
        CalculosMathematics calculosMathematics = new CalculosMathematics();

        while (true) {
            int menu = 0;
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        """
                                Escolha a opção desejada

                                1 - Realizar operações básicas
                                2 - Realizar operações avançadas
                                3 - Histórico
                                4 - Sair

                                Insira a opção
                                """, "Menu de opções", JOptionPane.PLAIN_MESSAGE));
                if (menu == 1 || menu == 2 || menu == 3 || menu == 4){
                } else{
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
            }

            switch (menu) {
                case 1:
                    while (true) {
                        try {
                            v1 = Double.parseDouble(JOptionPane.showInputDialog
                                    (null,"Insira o primeiro valor", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
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
                                            ""","Operações aritméticas",JOptionPane.QUESTION_MESSAGE));

                            if (operador ==1 || operador ==2 || operador ==3 || operador==4) { //Verifica se o operador é válido
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
                        case 1:
                            resultado = calculosMathematics.Soma(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("%.1f + %.1f = %.1f", v1, v2, resultado));
                            historico.add(String.format("%.1f + %.1f = %.1f", v1, v2, resultado));
                            break;
                        case 2:
                            resultado = calculosMathematics.Subtrai(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("%.1f - %.1f = %.1f", v1, v2, resultado));
                            historico.add(String.format("%.1f - %.1f = %.1f", v1, v2, resultado));
                            break;
                        case 3:
                            resultado = calculosMathematics.Multiplica(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("%.1f * %.1f = %.1f", v1, v2, resultado));
                            historico.add(String.format("%.1f * %.1f = %.1f", v1, v2, resultado));
                            break;
                        case 4:
                            if (v2 == 0) {
                                JOptionPane.showMessageDialog(null, "Não é possível realizar uma divisão por zero!");
                            } else {
                                resultado = calculosMathematics.Divide(v1, v2);
                                JOptionPane.showMessageDialog(null, String.format("%.1f / %.1f = %.1f", v1, v2, resultado));
                                historico.add(String.format("%.1f / %.1f = %.1f", v1, v2, resultado));
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Erro, operador inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;

                case 2:
                    while (true) {
                        try {
                            operador = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    """
                                            Escolha a operação
                                            
                                            1 - Raiz
                                            2 - Expoente
                                            3 - Porcentagem
                                            
                                            Insirá a opção
                                            ""","Operações aritméticas",JOptionPane.QUESTION_MESSAGE));

                            if (operador == 1) { //Verifica se o operador é válido
                                while (true) {
                                    try {
                                        v1 = Double.parseDouble(JOptionPane.showInputDialog
                                                (null, "Insira o numero", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                                        break;
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                                    }
                                } break;

                            } else if (operador == 2) { //Verifica se o operador é válido
                                while (true) {
                                    try {
                                        v1 = Double.parseDouble(JOptionPane.showInputDialog
                                                (null, "Insira a base", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                                        break;
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                                    }
                                }

                                while (true) {
                                    try {
                                        v2 = Double.parseDouble(JOptionPane.showInputDialog
                                                (null, "Insira o expoente", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                                        break;
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                                    }
                                } break;

                            } else if (operador == 3) { //Verifica se o operador é válido
                                while (true) {
                                    try {
                                        v1 = Double.parseDouble(JOptionPane.showInputDialog
                                                (null, "Insira a porcentagem", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                                        break;
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                                    }
                                }

                                while (true) {
                                    try {
                                        v2 = Double.parseDouble(JOptionPane.showInputDialog
                                                (null, "Insira o valor", "Entrada de dados", JOptionPane.QUESTION_MESSAGE));
                                        break;
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                                    }
                                } break;

                            } else {
                                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira uma operação válida", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    switch (operador) {
                        case 1:
                            resultado = calculosMathematics.Raiz(v1);
                            JOptionPane.showMessageDialog(null, String.format("√%.1f = %.1f", v1, resultado));
                            historico.add(String.format("√%.1f = %.1f", v1, resultado));
                            break;
                        case 2:
                            resultado = calculosMathematics.Expo(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("%.1f^%.1f = %.1f", v1, v2, resultado));
                            historico.add(String.format("%.1f^%.1f = %.1f", v1, v2, resultado));
                            break;
                        case 3:
                            resultado = calculosMathematics.Porcen(v1, v2);
                            JOptionPane.showMessageDialog(null, String.format("%.1f%% de %.1f = %.1f", v1, v2, resultado));
                            historico.add(String.format("%.1f%% de %.1f = %.1f", v1, v2, resultado));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Erro, operador inválido", "Erro", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;

                case 3:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Histórico\n\n");
                    sb.append(String.format("Foram realizadas %d operações\n\n", historico.size()));
                    for (String s : historico) {
                        sb.append(s);
                        sb.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString(), "Histórico", JOptionPane.PLAIN_MESSAGE);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando aplicação...", "Finalizando", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
            }
        }
    }
}
