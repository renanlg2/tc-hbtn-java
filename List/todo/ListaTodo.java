import java.util.ArrayList;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void adicionarTarefa(Tarefa tarefa) throws Exception{
        if (tarefa.getDescricao().equals(null) || tarefa.getDescricao().equals(""))
            throw new Exception("Descricao de tarefa invalida");

        for (Tarefa tarefaIndividual : this.tarefas){
            if (tarefaIndividual.getIdentificador() == tarefa.getIdentificador())
                throw new Exception("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
        }

        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        for (Tarefa tarefa : tarefas){
            if (tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(true);
                return true;
            }
        }

        return false;
    }

    public boolean desfazerTarefa(int identificador){
        for (Tarefa tarefa : tarefas){
            if (tarefa.getIdentificador() == identificador){
                tarefa.setEstahFeita(false);
                return true;
            }
        }

        return false;
    }

    public void desfazerTodas(){
        for (Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for (Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for (Tarefa tarefa : this.tarefas){
            if (tarefa.isEstahFeita()){
                System.out.println("[X]  Id: " + tarefa.getIdentificador() +" - Descricao: " + tarefa.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + tarefa.getIdentificador() +" - Descricao: " + tarefa.getDescricao());
            }
        }
    }

}
