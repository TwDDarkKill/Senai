package br.com.senai.modelo;
public class Veiculo {//Criando atributos
    private String modelo;
    private String marca;
    private int ano;

    //Criando os metodos
    public void Ligar(){
        System.out.println("Ligando o veiculo");
    }

    public void Desligar() {
        System.out.println("Desligando o veiculo");
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
//Para entrar Opções/Refactor/Encapsulate fields
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
