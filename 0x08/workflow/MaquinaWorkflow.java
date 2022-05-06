import atividades.Atividade;

public class MaquinaWorkflow {

    public void executar(Workflow workflow){
        for (Atividade atividade : workflow.getAtividade()){
            atividade.executar();
        }
    }

}
