package org.example.exercicio1;

public class SalvarService {

    public void salvarPedido(Pedido pedido){
        System.out.println("Pedido salvo com sucesso!");
        System.out.println("Quantidade: " + pedido.getQuantidade());
        System.out.println("Preco: " + pedido.getPreco());
        System.out.println("Total: "+ pedido.calculaTotal());

    }
}
