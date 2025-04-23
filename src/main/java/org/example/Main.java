package org.example;

import org.example.exercicio1.ImpressorService;
import org.example.exercicio1.Pedido;
import org.example.exercicio1.SalvarService;
import org.example.exercicio2.*;

public class Main {
    public static void main(String[] args) {
        //questao1
        Pedido pedido = new Pedido(5,20);
        ImpressorService impressorService = new ImpressorService();
        SalvarService salvarService = new SalvarService();

        impressorService.imprimirPedido(pedido);
        salvarService.salvarPedido(pedido);

        //questao2
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        Desconto Regular = new Regular();
        Desconto NenhumDesconto = new NenhumDesconto();
        Desconto VIP = new VIP();

        System.out.println("Desconto Regular: " + calculadora.calculateDiscount(Regular));
        System.out.println("Desconto VIP: " + calculadora.calculateDiscount(VIP));
        System.out.println("Sem desconto: " + calculadora.calculateDiscount(NenhumDesconto));


    }
}