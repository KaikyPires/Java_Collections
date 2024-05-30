package Set.Ordenação;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    private int quantidade;
    private double preco;

    public Produto(String nome, long cod, int quantidade, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    @Override
    public int compareTo(Produto p) {
       return nome.compareToIgnoreCase(p.getNome());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCod() {
        return cod;
    }
    public void setCod(long cod) {
        this.cod = cod;
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
    @Override
    public String toString() {
        return  "Produto{" +
        "codigo=" + cod +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }
}
    class ProdutosPorPreco implements Comparator<Produto> {

        @Override
        // Implementação da interface Comparator para definir uma ordem personalizada por preço
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
