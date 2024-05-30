package Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDeNumeros {
    private List<Integer> listNumeros;

    public OrdenacaoDeNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adcionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listAscendente = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            Collections.sort(listAscendente);
            return listAscendente;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listAscendente = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            listAscendente.sort(Collections.reverseOrder());
            return listAscendente;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros() {
        if (!listNumeros.isEmpty()) {
            System.out.println(this.listNumeros);
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

}

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoDeNumeros numeros = new OrdenacaoDeNumeros();

        // Adicionando números à lista
        numeros.adcionarNumero(2);
        numeros.adcionarNumero(5);
        numeros.adcionarNumero(4);
        numeros.adcionarNumero(1);
        numeros.adcionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

}
