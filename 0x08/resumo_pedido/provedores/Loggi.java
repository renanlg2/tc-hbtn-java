package provedores;

public class Loggi implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor){
        double valorFrete = 0;

        if (peso > 5000){
            valorFrete = valor * 0.12;
        } else {
            valorFrete = valor * 0.04;
        }

        Frete frete = new Frete(obterTipoProvedorFrete(), valorFrete);

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }


}
