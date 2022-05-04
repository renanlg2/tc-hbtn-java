public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public double getPercentualDesconto(){
        return this.percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }

    public void setItens(ItemPedido[] itens){
        this.itens = itens;
    }

    public double calcularTotal(){
        double valorTotal = 0;

        for (ItemPedido item: itens){
            valorTotal += item.getQuantidade() * (item.getProduto().obterPrecoLiquido());
        }

        return valorTotal - (valorTotal * getPercentualDesconto() / 100);
    }


}
