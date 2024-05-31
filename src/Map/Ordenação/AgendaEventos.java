package Map.Ordenação;

import java.security.spec.ECFieldF2m;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> exibirAgenda = new TreeMap<>(agendaMap);
        System.out.println(exibirAgenda);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> exibirAgenda = new TreeMap<>(agendaMap);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : agendaMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = dataAtual;
                proximoEvento = entry.getValue();
                break;
            }
            
        }
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getEvento() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia",
                "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 9), "Workshop de Programação",
                "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software",
                "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 28), "Hackathon de Inovação",
                "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial",
                "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }
}
