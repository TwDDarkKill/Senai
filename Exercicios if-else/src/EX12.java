import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EX12 {
	//teste
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> historico = new ArrayList<String>(); // declaração do ArrayList
		int menu, v1, v2, soma, pow, rz;

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Menu de Opções\n\n" +
							"1 - Somar dois números\n" +
							"2 - Raiz quadrada de um número\n" +
							"3 - Elevar um número a uma potência\n" +
							"4 - Histórico\n" +
							"5 - Sair\n\n" +
							"Digite a opção desejada\n\n",
					"Opções de calculos", JOptionPane.PLAIN_MESSAGE));

			if (menu < 1 || menu > 5) {
				JOptionPane.showMessageDialog(null, "Opção inválida digite novamente", "Erro", JOptionPane.ERROR_MESSAGE);
			} else if (menu == 1) {
				v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor", "Soma de valores", JOptionPane.INFORMATION_MESSAGE));
				v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor", "Soma de valores", JOptionPane.INFORMATION_MESSAGE));
				soma = v1 + v2;
				historico.add(v1 + " + " + v2 + " = " + soma); // adicionar a expressão ao ArrayList
				JOptionPane.showMessageDialog(null, "O valor da soma é igual a : " + soma, "Soma de valores", JOptionPane.INFORMATION_MESSAGE);
			} else if (menu == 2) {
				v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Raiz Quadrada", JOptionPane.INFORMATION_MESSAGE));
				rz = (int) Math.sqrt(v1);
				historico.add("Raiz de "+v1+" = "+ rz); // adicionar a expressão ao ArrayList
				JOptionPane.showMessageDialog(null, "O valor da raiz quadrada de : " + v1 + "\né igual a : " + rz, "Calculo de Raiz Quadrada", JOptionPane.INFORMATION_MESSAGE);
			} else if (menu == 3) {
				v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da base", "Potência de valores", JOptionPane.INFORMATION_MESSAGE));
				v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do expoente", "Potência de valores", JOptionPane.INFORMATION_MESSAGE));
				pow = (int) Math.pow(v1, v2);
				historico.add(v1 + " elevado a " + v2 + " = " + pow); // adicionar a expressão ao ArrayList
				JOptionPane.showMessageDialog(null, "O calculo da potencia de\n" + "Base : " + v1 + "\nElevado a potência : " + v2 + "\nÉ igual a : " + pow, "Calculo de Potências", JOptionPane.INFORMATION_MESSAGE);
			} else if (menu == 4) {
				StringBuilder resultados = new StringBuilder();
				for (String expr : historico){
					resultados.append(expr).append("\n");
				}
				JOptionPane.showMessageDialog(null, "Histórico:\n\n" + resultados, "Histórico de Cálculos", JOptionPane.INFORMATION_MESSAGE);
			} else if (menu == 5) {
				JOptionPane.showMessageDialog(null, "Encerrando a aplicação", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
			}
		} while (menu != 5);
	}}