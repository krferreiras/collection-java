import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Numero> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        numerosList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> ordenarNumeroAscendente = new ArrayList<>(numerosList);
        Collections.sort(ordenarNumeroAscendente);
        return ordenarNumeroAscendente;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> ordenarNumeroDescendente = new ArrayList<>(numerosList);
        Collections.sort(ordenarNumeroDescendente, new OrdenarDescendente());
        Collections.reverse(ordenarNumeroDescendente);
        return ordenarNumeroDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumeros(1);
        ordenacaoNumeros.adicionarNumeros(3);
        ordenacaoNumeros.adicionarNumeros(6);
        ordenacaoNumeros.adicionarNumeros(5);
        ordenacaoNumeros.adicionarNumeros(2);
        ordenacaoNumeros.adicionarNumeros(4);

        System.out.println(ordenacaoNumeros.numerosList);
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());


    }
}
