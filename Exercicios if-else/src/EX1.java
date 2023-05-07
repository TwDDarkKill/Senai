import javax.swing.*;
import java.util.ArrayList;

public class EX1 {

	public static void main(String[] args) {
		ArrayList<String> Lista = new ArrayList<>(); // Cria um ArrayList para armazenar valores de consulta

		// Solicita a entrada de dois valores numéricos
		double v1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro valor", "Entrada de dados", JOptionPane.PLAIN_MESSAGE));
		double v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo valor", "Entrada de dados", JOptionPane.PLAIN_MESSAGE));

		if (v1 > v2) { // verifica se o primeiro valor é maior que o segundo
			JOptionPane.showMessageDialog(null, "O primeiro valor é maior que o segundo!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else if (v1 < v2) { // verifica se o segundo valor é maior que o primeiro
			JOptionPane.showMessageDialog(null, "O segundo valor é maior que o primeiro!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		} else { // caso contrário, os valores são iguais
			JOptionPane.showMessageDialog(null, "Os valores são iguais!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}

		// Armazena o resultado da consulta na lista
		Lista.add("v1 = " + v1 + ", v2 = " + v2);

		// Exibe a quantidade de consultas realizadas
		System.out.printf("Foram realizadas %d consultas.\n", Lista.size());

		// Exibe todos os valores de consulta armazenados na lista
		for (String s : Lista) {
			System.out.println(s);
		}
	}
}
