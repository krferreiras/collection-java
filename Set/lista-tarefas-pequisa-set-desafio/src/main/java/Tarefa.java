import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean estado;

    public Tarefa(String descricao, boolean estado) {
        this.descricao = descricao;
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        if (estado){
            return "| Tarefa: "
                    + descricao
                    + " | Status: "
                    + "Concluido |";
        }else {
            return "| Tarefa: "
                    + descricao
                    + " | Status: "
                    + "A fazer |";
        }
    }
}
