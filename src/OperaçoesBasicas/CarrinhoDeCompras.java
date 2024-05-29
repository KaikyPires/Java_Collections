package OperaçoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoDecompras;

    public CarrinhoDeCompras() {
        this.carrinhoDecompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDecompras.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> removerItem = new ArrayList<>();
        if(!carrinhoDecompras.isEmpty()){
            for(Item item : carrinhoDecompras){
                if(item.getNome().equalsIgnoreCase(nome));
                carrinhoDecompras.removeAll(removerItem);
            }
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }
    public double calcularValorTotal(){
        double resultado = 0;
        if(!carrinhoDecompras.isEmpty()){
        for(Item preco : carrinhoDecompras){
            
            resultado += preco.getPreço() * preco.getQuantidade();
        }
        return resultado;
    }
    else{
        throw new RuntimeException("A lista esta ");
    }
    }
    public void exibirItems(){
        for(Item i : carrinhoDecompras){
            System.out.println(i);
        }
    }
}

