import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private long matricula;
    private String nome;
    private Double nota;

    public Aluno(long matricula, String name, Double nota) {
        this.matricula = matricula;
        this.nome = name;
        this.nota = nota;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "{Aluno: "
                + matricula +
                ", " + nome
                + ", Nota: " + nota + '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getNota(),aluno2.getNota());
    }
}

class ComparatorPorMatricula implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getMatricula(),aluno2.getMatricula());
    }
}
