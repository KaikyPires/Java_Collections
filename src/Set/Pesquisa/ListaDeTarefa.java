package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefa {

    Set<Tarefa> tarefaSet;

    public ListaDeTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaSet.isEmpty()) {
            Tarefa tarefaParaRemover = null;
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            if (tarefaParaRemover != null) {
                tarefaSet.remove(tarefaParaRemover);
            } else {
                System.out.println("Não foi encontrada uma tarefa com essa descrição.");
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirTarefa() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void contarTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet.size());
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidasSet = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isSituacao()) {
                    concluidasSet.add(t);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return concluidasSet;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentesSet = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.isSituacao()) {
                    pendentesSet.add(t);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return pendentesSet;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setSituacao(true);
                    tarefaConcluida = t;
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setSituacao(false);
                    tarefaPendente = t;
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    // Main para testar a classe
    public static void main(String[] args) {
        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();
        listaDeTarefa.adicionarTarefa("Estudar Java");
        listaDeTarefa.adicionarTarefa("Fazer compras");
        listaDeTarefa.adicionarTarefa("Limpar a casa");

        System.out.println("Tarefas:");
        listaDeTarefa.exibirTarefa();

        System.out.println("\nMarcar 'Fazer compras' como concluída:");
        listaDeTarefa.marcarTarefaConcluida("Fazer compras");
        listaDeTarefa.exibirTarefa();

        System.out.println("\nTarefas concluídas:");
        System.out.println(listaDeTarefa.obterTarefasConcluidas());

        System.out.println("\nTarefas pendentes:");
        System.out.println(listaDeTarefa.obterTarefasPendentes());

        System.out.println("\nRemover 'Estudar Java':");
        listaDeTarefa.removerTarefa("Estudar Java");
        listaDeTarefa.exibirTarefa();

        System.out.println("\nContar tarefas:");
        listaDeTarefa.contarTarefas();
    }
}