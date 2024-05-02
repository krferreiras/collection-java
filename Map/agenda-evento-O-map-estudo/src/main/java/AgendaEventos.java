import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private final Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data,String eventoNome,String artista){
        eventosMap.put(data,new Evento(eventoNome, artista));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " +  entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 2), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
