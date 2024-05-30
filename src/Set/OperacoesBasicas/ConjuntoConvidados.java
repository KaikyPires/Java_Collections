package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class ConjuntoConvidados {
    

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                } else {
                    System.out.println("Não foi achado um covidado com este codigo");
                }
            }

        } else {
            throw new RuntimeException("A lista esta vazia");
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public void exibirConvidado() {
        if (!convidadosSet.isEmpty()) {
            System.out.println(this.convidadosSet);
        } else {
            throw new RuntimeException("A lista esta vazia");
        }

    }

    public int contarConvidados() {
        return convidadosSet.size();

    }

    public static void main(String[] args) {
        ConjuntoConvidados convidado = new ConjuntoConvidados();
        convidado.adicionarConvidado("Kaiky", 12332);
        convidado.adicionarConvidado("Joao", 12395);
        convidado.adicionarConvidado("Ana", 12345);
        convidado.adicionarConvidado("Ana", 12345);
        convidado.exibirConvidado();
        convidado.removerConvidadoPorCodigoConvite(12345);
        System.out.println("Existem " + convidado.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

       
        System.out.println("Existem " + convidado.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    }
}
