import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao(){
        return this.numeracao;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual){
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        setSaldo(0);
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0){
            setSaldo(this.saldo + valor);
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0){

            if (valor <= getSaldo()){
                setSaldo(this.saldo - valor);
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }

        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
    }

    public double calcularTarifaMensal(){
        if ((getSaldo() * 0.10) < 10){
            return getSaldo() * 0.10;
        } else {
            return 10;
        }
    }

    public double calcularJurosMensal(){
        if (getSaldo() > 0){
            return getSaldo() * ((getTaxaJurosAnual() / 12) / 100);
        } else {
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal(){
        setSaldo(this.saldo + calcularJurosMensal() - calcularTarifaMensal());
    }
}
