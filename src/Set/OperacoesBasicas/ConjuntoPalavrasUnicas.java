package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conjuntoSet == null) ? 0 : conjuntoSet.hashCode());
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
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (conjuntoSet == null) {
            if (other.conjuntoSet != null)
                return false;
        } else if (!conjuntoSet.equals(other.conjuntoSet))
            return false;
        return true;
    }

    private Set<String> conjuntoSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        conjuntoSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        String removerPalavra = null;
        if(!conjuntoSet.isEmpty()){
            if(conjuntoSet.contains(palavra)){
                conjuntoSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada");
            }
            
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
        
    }
    public void verificarPalavra(String palavra){
        if(conjuntoSet.contains(palavra)){
            System.out.println("A palavra  " +palavra+ " está presente no conjunto");
        }else{
            System.out.println("Está palavra " +palavra+ " não está presente no conjunto");
        }
    }
    public void exibirPalavrasUnicas(){
        if(!conjuntoSet.isEmpty()){
        System.out.println(conjuntoSet);
    }else{
        throw new RuntimeException("A lista esta vazia");
    }
}
    
public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
    conjuntoLinguagens.adicionarPalavra("Java");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("JavaScript");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("C++");
    conjuntoLinguagens.adicionarPalavra("Ruby");

    conjuntoLinguagens.removerPalavra("Python");
    conjuntoLinguagens.exibirPalavrasUnicas();

    conjuntoLinguagens.verificarPalavra("Java");
   
}


}
