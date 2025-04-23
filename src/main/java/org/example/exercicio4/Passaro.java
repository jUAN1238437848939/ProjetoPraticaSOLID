package org.example.exercicio4;

//Modifique o código seguindo o Princípio da Substituição de Liskov.

public class Passaro implements AveVoadora {

    public void voar(){

        System.out.println("Voando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som voando");
    }
}
