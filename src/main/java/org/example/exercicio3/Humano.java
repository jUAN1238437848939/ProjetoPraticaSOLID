package org.example.exercicio3;

public  class Humano implements Trabalhador, Alimenta{
    @Override
    public void trabalhar() {
        System.out.println("Humano trabalhando");
    }

    @Override
    public void comer() {
        System.out.println("Humano comendo");
    }
}
