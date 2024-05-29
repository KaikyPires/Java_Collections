package Pesquisa;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CatalogoLivros {
    List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adcionarLivro(String titulo, String autor, int anoDePublicacao){
        livrosList.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
        for(Livro l : livrosList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getAnoDePublicacao() >=anoInicial && l.getAnoDePublicacao() <=anoFinal) {
                  livrosPorIntervaloAnos.add(l);  
                }
               
            }
            return livrosPorIntervaloAnos;
    }else{
        throw new RuntimeException("A lista esta vazia");
    }
}
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;  
                    break;
                }
            }
            return livroPorTitulo;
    }else{
        throw new RuntimeException("A lista esta vazia");
    }
    }
    public void listaDeLivros(){
        for(Livro l : livrosList){
            System.out.println(l);
        }
    }
}
