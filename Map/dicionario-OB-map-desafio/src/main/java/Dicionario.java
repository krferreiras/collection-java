import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
            dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String nome) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(nome);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirDicionario() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoDaPalavra = null;
        if (!dicionario.isEmpty()) {
            definicaoDaPalavra = dicionario.get(palavra);
        }
        return definicaoDaPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Fama","Reconhecimento ou reputação de algo ou alguém.");
        dicionario.adicionarPalavra("Pedagio","Tributo de passagem por uma via de transporte.");
        dicionario.adicionarPalavra("Ventilador","O que ventila, o mesmo que ventilante, aparelho para ventilar.");
        dicionario.adicionarPalavra("Tiroteio","Ato ou ocorrência de disparar armas de fogo, especialmente em um confronto");
        dicionario.adicionarPalavra("Xarope","Medicamento líquido e viscoso, que se obtém misturando certos líquidos\n " +
                "com a porção de açúcar necessária para os saturar.");
        dicionario.adicionarPalavra("Velodrome","local destinado a corridas ciclísticas, dotado de pistas, instalações" +
                "\n para o público etc.");

        dicionario.exibirDicionario();

        dicionario.removerPalavra("Xarope");
        dicionario.exibirDicionario();

        System.out.println("O significado de Fama é: " + dicionario.pesquisarPorPalavra("Fama"));

    }
}
