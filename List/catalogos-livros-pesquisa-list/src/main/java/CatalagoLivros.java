import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> listaLivros;

    public CatalagoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String title, String author, Integer publicationYear){
        listaLivros.add(new Livro(title,author,publicationYear));
    }

    public List<Livro> pesquisarPorAutor(String author){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro L: listaLivros) {
                if(L.getAuthor().equalsIgnoreCase(author)){
                    livrosPorAutor.add(L);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAno(int initialYear, int finalYear){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if(l.getPublicationYear()>=initialYear && l.getPublicationYear() <= finalYear){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String title){
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros) {
                if (l.getTitle().equalsIgnoreCase(title)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1","Autor 1",2020);
        catalagoLivros.adicionarLivro("Livro 1","Autor 2",2021);
        catalagoLivros.adicionarLivro("Livro 2","Autor 2",2022);
        catalagoLivros.adicionarLivro("Livro 3","Autor 3",2023);
        catalagoLivros.adicionarLivro("Livro 4","Autor 4",1994);

        System.out.println(catalagoLivros.pesquisarPorAutor("autor 2"));
        System.out.println(catalagoLivros.pesquisaPorIntervaloAno(2020,2021));
        System.out.println(catalagoLivros.pesquisaPorTitulo("Livro 1"));

    }
}
