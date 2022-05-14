import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Agencia(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nome, double valor){
        if (buscarCliente(nome) == null){
            this.clientes.add(new Cliente(nome,valor));
            return true;
        }

        return false;
    }

    public boolean adicionarTransacaoCliente(String nome, double valorTransacao){
        if (buscarCliente(nome) != null){
            buscarCliente(nome).adicionarTransacao(valorTransacao);
            return true;
        }

        return false;
    }

    public Cliente buscarCliente(String nome){
        for (Cliente cliente : this.clientes){
            if (cliente.getNome().equals(nome)){
                return cliente;
            }
        }

        return null;
    }
}
