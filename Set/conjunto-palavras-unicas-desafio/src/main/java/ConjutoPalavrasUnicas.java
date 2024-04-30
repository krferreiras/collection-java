import java.util.HashSet;
import java.util.Set;

public class ConjutoPalavrasUnicas {
    private final Set<String> conjuntoPalavras;

    public ConjutoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }


    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if(!conjuntoPalavras.isEmpty()){
            for (String p : conjuntoPalavras) {
                if(p.equalsIgnoreCase(palavra)){
                    palavraParaRemover = p;
                    break;
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        conjuntoPalavras.remove(palavraParaRemover);
    }

    public String verificaPalavra(String palavra){
        String verificador = null;
        if(!conjuntoPalavras.isEmpty()){
            for (String p : conjuntoPalavras) {
                if(p.equalsIgnoreCase(palavra)){
                    verificador = "A palavra "+palavra.toUpperCase()+" está contida no conjunto";
                    break;
                }else {
                    verificador = "A palavra "+palavra.toUpperCase()+" não está contida no conjunto";
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return verificador;
    }

    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavras.isEmpty()){
            System.out.println(conjuntoPalavras);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ConjutoPalavrasUnicas conjutoPalavrasUnicas = new ConjutoPalavrasUnicas();

        conjutoPalavrasUnicas.adicionarPalavra("Gato");
        conjutoPalavrasUnicas.adicionarPalavra("Cachorro");
        conjutoPalavrasUnicas.adicionarPalavra("Papagaio");
        conjutoPalavrasUnicas.adicionarPalavra("Gato");
        conjutoPalavrasUnicas.adicionarPalavra("Lebre");

        conjutoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjutoPalavrasUnicas.verificaPalavra("Cachorro"));
        System.out.println(conjutoPalavrasUnicas.verificaPalavra("Tigre"));

        conjutoPalavrasUnicas.removerPalavra("Gato");

        conjutoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
