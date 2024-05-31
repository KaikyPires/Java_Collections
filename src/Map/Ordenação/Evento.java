package Map.Ordenação;

import java.time.LocalDate;

public class Evento {
    private String evento;

    private String atracao;

    public Evento(String evento, String atracao) {
        this.evento = evento;
        this.atracao = atracao;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }
    
    
   
    
}
