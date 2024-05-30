package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    
    private List<Integer> listNumeros;

    public SomaDeNumeros() {
        this.listNumeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.listNumeros.add(numero);
    }
    public int calcularSoma(){
       int resultadoSoma = 0;
        
            for(Integer n : listNumeros){
                resultadoSoma += n;
            }
            return resultadoSoma;
       
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listNumeros.isEmpty()){
            for(Integer n : listNumeros){
                if(n >= maiorNumero){
                    maiorNumero = n;
                }
            }
            return maiorNumero;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listNumeros.isEmpty()){
            for(Integer n : listNumeros){
                if(n <= menorNumero){
                    menorNumero = n;
                }
            }
            return menorNumero;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public void exibirNumeros(){
        System.out.println("Numeros adcionados: \n");
   
            System.out.println(this.listNumeros);
        
    }
    }

