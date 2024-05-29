import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
      }
    

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
          for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefasParaRemover.add(t);
            }
          }
          tarefaList.removeAll(tarefasParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    public void obterDescricoesTarefas(){
        for(Tarefa l : tarefaList){
            System.out.println(l);
        }
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
      }

}
    