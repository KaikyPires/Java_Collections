package Pesquisa;

public class MainNumeros {
    public static void main(String[] args) throws Exception {
    SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

    somaDeNumeros.adicionarNumero(9);
    somaDeNumeros.adicionarNumero(12);
    somaDeNumeros.adicionarNumero(3);

    somaDeNumeros.exibirNumeros();
    System.out.println(somaDeNumeros.calcularSoma());;
    System.out.println(somaDeNumeros.encontrarMaiorNumero());
    
    
    }
}
