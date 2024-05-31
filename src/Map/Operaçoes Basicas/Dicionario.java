package Map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adcionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public String removerPalavra(String palavra) {
        String palavraRemovida = null;
        if (!dicionarioMap.isEmpty()) {
            palavraRemovida = dicionarioMap.remove(palavra);
            return palavraRemovida;
        } else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPalavra;
        if (!dicionarioMap.isEmpty()) {
            if (dicionarioMap.containsKey(palavra)) {
                definicaoPalavra = dicionarioMap.get(palavra);
                return definicaoPalavra;
            } else {
                return "Palavra não encontrada";
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adcionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adcionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adcionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
