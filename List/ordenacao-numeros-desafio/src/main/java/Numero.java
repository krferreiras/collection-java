import java.util.Comparator;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numero num) {
        return Integer.compare(numero,num.getNumero());
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("%d",numero);
    }
}

class OrdenarDescendente implements Comparator<Numero>{

    @Override
    public int compare(Numero num1, Numero num2) {
        return Integer.compare(num1.getNumero() , num2.getNumero());
    }
}
