import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private final Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }else {
            System.out.println("O map está vazio!");
        }
    }

    public void exibirContagemPalavras(){
        if(!contagemPalavrasMap.isEmpty()){
            System.out.println(contagemPalavrasMap);
        }else {
            System.out.println("O map está vazio!");
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int contagemNoTexto = 0;
        if(!contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String,Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > contagemNoTexto){
                    contagemNoTexto = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }else {
            System.out.println("O map está vazio!");
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        contagemPalavras.exibirContagemPalavras();

        System.out.println("A linguagem mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
