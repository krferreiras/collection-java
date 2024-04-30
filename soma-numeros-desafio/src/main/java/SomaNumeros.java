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
        int maior = 0;
        for (Numero numero : listaNumeros) {
            if(numero.getNumero() > maior){
                maior = numero.getNumero();
            }
        }
        return maior;
    }

    public  int encontrarMenorNumero(){
        int menor = 0;
        for (Numero numero : listaNumeros) {
            if (menor == 0){
                menor = numero.getNumero();
            }else if(numero.getNumero() < menor){
                menor = numero.getNumero();
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println("Lista de números" + listaNumeros.toString());
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(45);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(56);
        somaNumeros.adicionarNumero(1);

        somaNumeros.exibirNumeros();

        System.out.println("Soma dos valores: "+somaNumeros.calcularSoma());
        System.out.println("Maior valor: "+somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor valor: "+somaNumeros.encontrarMenorNumero());



    }
}
