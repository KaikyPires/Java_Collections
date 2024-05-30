package Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    
    List<Pessoa> listPessoas;
    
    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }
    public void adcionarPessoa(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenarPorIdade = new ArrayList<>(listPessoas);
     
        if(!listPessoas.isEmpty()){
            Collections.sort(ordenarPorIdade);
            return ordenarPorIdade;
                }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
        
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenarPorAltura = new ArrayList<>(listPessoas);
        if(!listPessoas.isEmpty()){
          Collections.sort(ordenarPorAltura, new ComparatorPorAltura());
            return ordenarPorAltura;      
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
        
    }
   
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adcionarPessoa("Kaiky", 19, 1.81);
        ordenacaoPessoas.adcionarPessoa("Mariana", 22, 1.68);
        ordenacaoPessoas.adcionarPessoa("Pedro", 25, 1.75);
        ordenacaoPessoas.adcionarPessoa("Ana", 20, 1.60);
        ordenacaoPessoas.adcionarPessoa("Lucas", 18, 1.80);
        ordenacaoPessoas.adcionarPessoa("Bianca", 23, 1.70);
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
    
