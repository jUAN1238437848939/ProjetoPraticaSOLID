package org.example.exercicio2;

//Refatore o código para que siga o Princípio Aberto/Fechado

public class CalculadoraDeDesconto {

    public double calculateDiscount(Desconto desconto) {
        return desconto.calcular();
    }


}
