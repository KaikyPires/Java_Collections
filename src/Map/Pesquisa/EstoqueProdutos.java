package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!estoqueProdutoMap.isEmpty()) {
        
                System.out.println(estoqueProdutoMap);
            
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public double calcularValorTotalEstoque() {
        double armazenaTotal = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                armazenaTotal += p.getPreco() * p.getQuantidade();
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return armazenaTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto nomeDoProduto = null;
        double ProdutoMaisCaro = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > ProdutoMaisCaro) {
                    ProdutoMaisCaro = p.getPreco();
                    nomeDoProduto = p;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return nomeDoProduto;
    }

    public Produto obterProdutoMaisBarato() {
        Produto nomeDoProduto = null;
        double ProdutoMaisBarato = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < ProdutoMaisBarato) {
                    ProdutoMaisBarato = p.getPreco();
                    nomeDoProduto = p;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return nomeDoProduto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto nomeDoProduto = null;
        double ProdutoMaisCaro = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if ((p.getPreco() * p.getQuantidade()) > ProdutoMaisCaro) {
                    ProdutoMaisCaro = p.getPreco() * p.getQuantidade();
                    nomeDoProduto = p;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return nomeDoProduto;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
