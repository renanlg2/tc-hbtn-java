import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual){
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes(){
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidade){
        this.quantidadeTransacoes += quantidade;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0){
            if (valor <= getSaldo()){
                super.sacar(valor);
                aplicarTarifa(0.10);
                setQuantidadeTransacoes(1);
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }

        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0){
            super.depositar(valor);
            aplicarTarifa(0.10);
            setQuantidadeTransacoes(1);
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void aplicarTarifa(double valor){
        super.setSaldo(super.getSaldo() - valor);
    }
}
