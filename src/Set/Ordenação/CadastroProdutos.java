package Set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> cadastroSet;

    public CadastroProdutos() {
        this.cadastroSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        cadastroSet.add(new Produto(nome, cod, quantidade, preco));
    }

    public Set<Produto> exibirProdutosPorNome() {
        // TreeSet utilizado para ordenar produtos pelo nome (ordem natural definida em
        // compareTo)
        Set<Produto> ordenarPorNome = new TreeSet<>(cadastroSet);
        return ordenarPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        // TreeSet utilizado para ordenar produtos pelo preço (ordem personalizada
        // definida em ProdutosPorPreco)
        Set<Produto> ordenarPorPreco = new TreeSet<>(new ProdutosPorPreco());
        ordenarPorPreco.addAll(cadastroSet); // Adiciona todos os produtos ao TreeSet ordenado por preço
        return ordenarPorPreco;
    }
        public static void main(String[] args) {
            // Criando uma instância do CadastroProdutos
            CadastroProdutos cadastroProdutos = new CadastroProdutos();
        
            // Adicionando produtos ao cadastro
            cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
            cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
            cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
            cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
        
            // Exibindo todos os produtos no cadastro
            System.out.println(cadastroProdutos.cadastroSet);
        
            // Exibindo produtos ordenados por nome
            System.out.println(cadastroProdutos.exibirProdutosPorNome());
        
            // Exibindo produtos ordenados por preço
            System.out.println(cadastroProdutos.exibirProdutosPorPreco());
          
        }
}
