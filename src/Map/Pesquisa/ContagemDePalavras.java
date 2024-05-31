package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    private Map<String, Integer > contagemDePalavrasMap;

    public ContagemDePalavras() {
        this.contagemDePalavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemDePalavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if (!contagemDePalavrasMap.isEmpty()) {
            if(contagemDePalavrasMap.containsKey(palavra)){
                contagemDePalavrasMap.remove(palavra);
            }
            else{
                System.out.println("Palavra não encontrada");
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }        
    }
    public int exibirContagemDePalavra(){
        int contagem = 0;
        if (!contagemDePalavrasMap.isEmpty()) {
        for(int c : contagemDePalavrasMap.values()){
            contagem += c;
            
        }
        return contagem;
        } else {
            throw new RuntimeException("A lista está vazia");
        } 
               
    }
    public String exibirPalavraMaisFrequente(){
        if (!contagemDePalavrasMap.isEmpty()) {
           System.out.println(contagemDePalavrasMap.size());

        } else {
            throw new RuntimeException("A lista está vazia");
        }        
    }

    }

    

