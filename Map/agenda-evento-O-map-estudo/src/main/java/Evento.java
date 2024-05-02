public class Evento {
    private String eventoNome;
    private String artista;

    public Evento(String eventoNome, String artista) {
        this.eventoNome = eventoNome;
        this.artista = artista;
    }

    public String getEventoNome() {
        return eventoNome;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "eventoNome='" + eventoNome + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
