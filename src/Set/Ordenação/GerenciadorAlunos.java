package Set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> secretariaSet;

    public GerenciadorAlunos() {
        this.secretariaSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        secretariaSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        if (!secretariaSet.isEmpty()) {
           Aluno alunoParaRemover = null;
           for(Aluno a : secretariaSet){
            if(a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
            
           else{
            System.out.println("Numero de matricula não encontrada");
           }
        }
           secretariaSet.remove(alunoParaRemover);
        } 
         else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        if (!secretariaSet.isEmpty()) {
            Set<Aluno> ordenarPorNome = new TreeSet<>(secretariaSet);
            return ordenarPorNome;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        if (!secretariaSet.isEmpty()) {
            Set<Aluno> ordenarPorNota = new TreeSet<>(new AlunosPorNota());
            ordenarPorNota.addAll(secretariaSet);
            return ordenarPorNota;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirAlunos() {
        if (!secretariaSet.isEmpty()) {
            System.out.println(secretariaSet);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
    
        System.out.println("Alunos após remoção:");
        gerenciadorAlunos.exibirAlunos();
    
        // Exibindo alunos ordenados por nome
        System.out.println("Alunos ordenados por nome:");
        for (Aluno a : gerenciadorAlunos.exibirAlunosPorNome()) {
            System.out.println(a);
        }
    
        // Exibindo alunos ordenados por nota
        System.out.println("Alunos ordenados por nota:");
        for (Aluno a : gerenciadorAlunos.exibirAlunosPorNota()) {
            System.out.println(a);
        }
    }
}
