package br.com.senai.main;
import br.com.senai.modelo.Veiculo;

public class Main {
    public static void main(String[]args){

        //Criando um objeto
        //Para entrar Opções/Refactor/Encapsulate fields

        Veiculo corsa  = new Veiculo();
        corsa.setModelo("corsa");
        corsa.setAno(1998);
        corsa.setMarca("Chevrolet");
      // corsa.Ligar();

        System.out.println(corsa.getMarca());
        System.out.println(corsa.getAno());

        Veiculo Opala = new Veiculo();
        Opala.setAno(1978);
        Opala.setModelo("Opala");
        Opala.setMarca("Chevrolet");
       System.out.println(Opala.getModelo());
       System.out.println(Opala.getAno());
    }
}
