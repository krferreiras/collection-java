import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }else {
            System.out.println("A agenda está vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kaio", 13246213);
        agendaContatos.adicionarContato("Kaio", 87865242);
        agendaContatos.adicionarContato("Kaio Rodrigo", 872767);
        agendaContatos.adicionarContato("Kaio R", 5738465);
        agendaContatos.adicionarContato("Hrodric", 872767);
        agendaContatos.adicionarContato("Kaio", 753537);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Hrodric");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisaPorNome("Kaio Rodrigo"));
    }
}
