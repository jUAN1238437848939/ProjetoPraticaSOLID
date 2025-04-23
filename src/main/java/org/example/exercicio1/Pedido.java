package org.example.exercicio1;

//Refatore o código para que a classe Pedido siga o Princípio da Responsabilidade Única.

public class Pedido {
    private int quantidade;
    private double preco;

    public Pedido(int quantidade, double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public double calculaTotal(){
        return quantidade * preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void salvarPedido(){
        // Lógica para salvar no banco
    }
}
