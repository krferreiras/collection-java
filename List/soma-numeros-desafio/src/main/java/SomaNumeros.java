import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private final List<Numero> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(new Numero(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        for (Numero numero:listaNumeros) {
            soma += numero.getNumero();
        }
        return soma;
    }

    public  int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()){
            for (Numero numero : listaNumeros) {
                if(numero.getNumero() >= maior){
                    maior = numero.getNumero();
                }
            }
            return maior;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public  int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()){
            for (Numero numero : listaNumeros) {
                if(numero.getNumero() <= menor){
                    menor = numero.getNumero();
                }
            }
            return menor;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!listaNumeros.isEmpty()) {
            System.out.println("Lista de números" + listaNumeros.toString());
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();

        System.out.println("Soma dos valores: "+somaNumeros.calcularSoma());
        System.out.println("Maior valor: "+somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor valor: "+somaNumeros.encontrarMenorNumero());



    }
}
