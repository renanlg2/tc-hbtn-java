public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        modificarDescricao(descricao);
        setIdentificador(identificador);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao) throws Exception {

        if (descricao.equals(null) || descricao.equals(""))
            throw new Exception("Descricao de tarefa invalida");

        setDescricao(descricao);
    }
}
