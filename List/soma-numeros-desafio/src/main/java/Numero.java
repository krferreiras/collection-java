public class Numero {
    private Integer numero;

    public Numero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return getNumero().toString();
    }
}
