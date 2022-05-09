package provedores;

public class Frete {
    private TipoProvedorFrete tipoProvedorFrete;
    private double valor;

    public Frete(TipoProvedorFrete tipoProvedorFrete, double valor){
        setTipoProvedorFrete(tipoProvedorFrete);
        setValor(valor);
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return this.tipoProvedorFrete;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete){
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
