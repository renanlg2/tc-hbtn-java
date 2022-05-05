public class Pedido {
    private ItemPedido[] itens;
    private double percentualDesconto;

    public Pedido(double percentualDesconto, ItemPedido[] itens){
        this.itens = itens;
        this.percentualDesconto  =  percentualDesconto;
    }

    public double calcularTotal(){
        double valorTotal = 0;

        for (ItemPedido item:itens){
            valorTotal += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }

        return valorTotal - (valorTotal * percentualDesconto / 100);
    }
}
