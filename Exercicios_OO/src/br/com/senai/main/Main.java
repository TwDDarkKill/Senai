package br.com.senai.main;
import br.com.senai.modelo.Veiculo;

public class Main {
    public static void main(String[]args){

        //Criando um objeto

        Veiculo corsa  = new Veiculo();
        corsa.ano = 1998;
        corsa.marca = "Chevrolet";
        corsa.Ligar();

        Veiculo Opala = new Veiculo();
        Opala.ano = 1978;
        Opala.modelo = "Opala";
        Opala.marca = "Chevrolet";
        Opala.Desligar();
    }
}
