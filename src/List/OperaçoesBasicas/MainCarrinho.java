package OperaçoesBasicas;

import java.util.ArrayList;

public class MainCarrinho {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Nescau", 7.00, 2);
        carrinho.adicionarItem("Leite", 5.50, 3);
        carrinho.adicionarItem("Pão", 3.00, 6);
        carrinho.adicionarItem("Queijo", 20.00, 1);
        carrinho.adicionarItem("Presunto", 15.00, 2);
        carrinho.adicionarItem("Manteiga", 8.00, 1);

        carrinho.removerItem("Queijo");
        carrinho.exibirItems();
        System.out.println("No total o valor do carrinho e de R$ " +carrinho.calcularValorTotal());
    }
    }
