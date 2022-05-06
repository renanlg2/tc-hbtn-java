import atividades.Atividade;

import java.util.ArrayList;

public class Workflow {
    ArrayList<Atividade> atividade = new ArrayList<Atividade>();

    public Workflow(){

    }

    public ArrayList<Atividade> getAtividade() {
        return atividade;
    }

    public void registrarAtividade(Atividade atividade){
        this.atividade.add(atividade);
    }
}
