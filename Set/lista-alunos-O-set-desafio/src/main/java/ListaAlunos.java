import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAlunos {
    private final Set<Aluno> alunoSet;

    public ListaAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, Double nota) {
        alunoSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemocao = null;
        boolean alunoExiste = true;
        if (!alunoSet.isEmpty()){
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    alunoRemocao = aluno;
                    alunoExiste = true;
                    break;
                }else {
                    alunoExiste = false;
                }
            }
            if (!alunoExiste){
                System.out.println("A tarefa não existe na lista");
            }else {
                alunoSet.remove(alunoRemocao);
            }
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public void exibirListaAlunos() {
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("A LISTA ESTÁ VAZIA");
        }
    }

    public Set<Aluno> exibirListaPorNome() {
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirListaPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirListaPorMatricula() {
        Set<Aluno> alunosPorMatricula = new TreeSet<>(new ComparatorPorMatricula());
        alunosPorMatricula.addAll(alunoSet);
        return alunosPorMatricula;
    }

    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();

        listaAlunos.exibirListaAlunos();

        listaAlunos.adicionarAluno(14548, "Flavio Pneu Filho", 8.6);
        listaAlunos.adicionarAluno(45651, "Shaolin de Souza Porco", 7.5);
        listaAlunos.adicionarAluno(75691, "Elom Muchem", 6.5);
        listaAlunos.adicionarAluno(73578, "Ekis AE Adoze", 10.0);

        listaAlunos.exibirListaAlunos();
        System.out.println(listaAlunos.exibirListaPorNome());

        listaAlunos.removerAluno(75691);
        System.out.println(listaAlunos.exibirListaPorNome());
        System.out.println(listaAlunos.exibirListaPorNota());
        System.out.println(listaAlunos.exibirListaPorMatricula());

    }
}
