package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> agendaSet;

    public AgendaContatos() {
        this.agendaSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        agendaSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(agendaSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if(!agendaSet.isEmpty()){
            for(Contato c : agendaSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                
                }
            }
        }else{
                throw new RuntimeException("A lista está vazia");
            }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!agendaSet.isEmpty()){
            for(Contato c : agendaSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroDeTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();

        contato.adicionarContato("João", 123456789);
        contato.adicionarContato("Maria", 987654321);
        contato.adicionarContato("Maria Fernandes", 55555555);
        contato.adicionarContato("Ana", 88889999);
        contato.adicionarContato("Fernando", 77778888);
        contato.adicionarContato("Carolina", 55555555);
    
        // Exibindo os contatos na agenda
        contato.exibirContatos();
    
        // Pesquisando contatos pelo nome
        System.out.println(contato.pesquisarPorNome("Maria"));
    
        // Atualizando o número de um contato
        Contato contatoAtualizado = contato.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        contato.exibirContatos();
    
    }
}
