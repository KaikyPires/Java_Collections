package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaMap.put(nome, telefone);
    }

 
    public int removerContato(String nome) {
        Integer removerContato = null;
        if (!agendaMap.isEmpty()) {
            removerContato = agendaMap.remove(nome);
            return removerContato;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }


    public void exibirContatos() {
        if (!agendaMap.isEmpty()) {
            System.out.println(agendaMap);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Integer pesquisaPorNome(String nome) {
        if (!agendaMap.isEmpty()) {
        
            return agendaMap.get(nome);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
        //O ultimo q vai ser colocado
        System.out.println("Lista de contatos:");
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");
        System.out.println("Lista de contatos após remover Maria:");
        agendaContatos.exibirContatos();

        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisaPorNome(nomePesquisa);
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisaPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
