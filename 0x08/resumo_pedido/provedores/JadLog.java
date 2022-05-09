package provedores;

public class JadLog implements  ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor){
        double valorFrete = 0;

        if (peso > 2000){
            valorFrete = valor * 0.07;
        } else {
            valorFrete = valor * 0.045;
        }

        Frete frete = new Frete(obterTipoProvedorFrete(), valorFrete);

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }

}
