import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>();
        adicionarTransacao(transacao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao){
        this.transacoes.add(valorTransacao);
    }



}
