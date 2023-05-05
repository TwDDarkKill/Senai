package br.com.exercicios.modelo;

import javax.swing.*;

public class SegundaClasse {
    public void descrição() {
        JLabel label = new JLabel("Aprendendo programação nível Galo Cinza", JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label, "Descrição", JOptionPane.PLAIN_MESSAGE);
    }
    public void curso() {
        JLabel label = new JLabel("JAVA NA VEIA", JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label, "Curso", JOptionPane.PLAIN_MESSAGE);
    }
}
