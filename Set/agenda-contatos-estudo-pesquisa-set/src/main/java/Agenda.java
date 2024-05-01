import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatoSet;

    public Agenda() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        if(!contatoSet.isEmpty()){
            System.out.println(contatoSet);
        }else {
            throw new RuntimeException("Agenda vazia");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for (Contato contato:contatoSet){
                if(contato.getNome().startsWith(nome)){
                    contatosPorNome.add(contato);
                }
            }
            return contatosPorNome;
        }else {
            throw new RuntimeException("Agenda vazia");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("Kaio", 13246213);
        agenda.adicionarContato("Kaio", 87865242);
        agenda.adicionarContato("Kaio Rodrigo", 872767);
        agenda.adicionarContato("Kaio R", 5738465);
        agenda.adicionarContato("Hrodric", 872767);

        agenda.exibirContato();

        System.out.println(agenda.pesquisarPorNome("Hro"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Hrodric", 45676));

        agenda.exibirContato();
    }
}
