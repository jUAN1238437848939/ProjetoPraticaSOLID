package org.example.exercicio1;

public class ImpressorService {
    public void imprimirPedido(Pedido pedido){
        System.out.println("Pedido:");
        System.out.println("Quantidade:"+ pedido.getQuantidade());
        System.out.println("Preço: R$"+ pedido.getPreco());
        System.out.println("Total: R$" + pedido.calculaTotal());
    }
}
