import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean estado){
        tarefaSet.add(new Tarefa(descricao, estado));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaARemover = null;
        boolean tarefaExiste = true;
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaARemover = tarefa;
                    tarefaExiste = true;
                    break;
                }else {
                    tarefaExiste = false;
                }
            }
            if (!tarefaExiste){
                System.out.println("A tarefa não existe na lista");
            }else {
                tarefaSet.remove(tarefaARemover);
            }
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.isEstado()){
                    tarefasConcluidas.add(tarefa);
                }
            }
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if (!tarefa.isEstado()){
                    tarefasPendentes.add(tarefa);
                }
            }
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setEstado(true);
                }
            }
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setEstado(false);
                }
            }
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public void limparListaTarfeas(){
        if (!tarefaSet.isEmpty()){
            tarefaSet.clear();
        }else {
            System.out.println("Lista de tarefas vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tirar lixo", true);
        listaTarefas.adicionarTarefa("Tirar lixo", false);
        listaTarefas.adicionarTarefa("Limpar móvel",true);
        listaTarefas.adicionarTarefa("Estudar",false);
        listaTarefas.adicionarTarefa("Jogar",true);
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();
        System.out.println("EXCLUINDO TAREFA");
        listaTarefas.removerTarefa("Assistir");
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        System.out.println();
        listaTarefas.exibirTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println();
        listaTarefas.marcarTarefaConcluida("Estudar");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println();
        listaTarefas.marcarTarefaPendente("Tirar lixo");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println();
        listaTarefas.limparListaTarfeas();
        listaTarefas.exibirTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

    }
}
