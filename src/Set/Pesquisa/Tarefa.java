package Set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean situacao;


    
    public Tarefa(String descricao, boolean situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isSituacao() {
        return situacao;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", situacao=" + situacao + "]";
    }
    
}
