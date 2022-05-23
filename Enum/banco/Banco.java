import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String agencia){
        for (Agencia agenciaInd: this.agencias) {
            if (agenciaInd.getNome().equals(agencia)){
                return agenciaInd;
            }
        }

        return null;
    }

    public boolean adicionarAgencia(String agencia){
        if (buscarAgencia(agencia) == null){
            this.agencias.add(new Agencia(agencia));
            return true;
        }

        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia != null){
            if (agencia.buscarCliente(nomeCliente) == null){
                agencia.novoCliente(nomeCliente, valorTransacao);
                adicionarAgencia(nomeAgencia);
                return true;
            }
        }

        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia != null){
            if (agencia.buscarCliente(nomeCliente) != null){
                agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
                return true;
            }
        }

        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes){
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia != null){
            int contadorCliente = 0;
            for (Cliente cliente : agencia.getClientes()){
                contadorCliente += 1;
                System.out.println("Cliente: " + cliente.getNome() + " [" + contadorCliente + "]");
                if (imprimeTransacoes){
                    int contadorTransacao = 0;
                    for (double transacao : cliente.getTransacoes()){
                        contadorTransacao += 1;
                        System.out.println("  [" + contadorTransacao + "] valor " + transacao);
                    }
                }
            }
        }

        return false;
    }

}
