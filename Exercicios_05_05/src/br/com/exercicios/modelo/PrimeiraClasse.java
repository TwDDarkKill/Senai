package br.com.exercicios.modelo;

import javax.swing.*;

public class PrimeiraClasse {

    public void ola() {
        JLabel label = new JLabel("Bem-vindo a orientação à objetos", JLabel.CENTER);
        JOptionPane.showMessageDialog(null, label, "Mensagem de boas-vindas", JOptionPane.PLAIN_MESSAGE);
    }
}
