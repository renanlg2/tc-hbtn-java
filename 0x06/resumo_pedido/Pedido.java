import java.util.Locale;

public class Pedido {
    private ItemPedido[] itens;
    private double percentualDesconto;

    public Pedido(double percentualDesconto, ItemPedido[] itens){
        this.itens = itens;
        this.percentualDesconto  =  percentualDesconto;
    }

    public double calcularTotalBruto(){
        double valorTotal = 0;

        for (ItemPedido item:itens){
            valorTotal += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }

        return valorTotal;
    }

    public double getValorDesconto(){
        return calcularTotalBruto() * percentualDesconto / 100;
    }

    public double calcularTotal(){
        return calcularTotalBruto() - getValorDesconto();
    }

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido item:itens){

            System.out.println(
                    "Tipo: " + item.getProduto().getClass().getSimpleName() + "  " +
                    "Titulo: " + item.getProduto().getTitulo() + "  " +
                    "Preco: " + String.format("%.2f", item.getProduto().obterPrecoLiquido()) + "  " +
                    "Quant: " + item.getQuantidade() + "  " +
                    "Total: " + String.format("%.2f",item.getQuantidade() * item.getProduto().obterPrecoLiquido()));
        }

        System.out.print(
                "----------------------------\n" +
                "DESCONTO: " + String.format("%.2f",this.getValorDesconto()) + "\n" +
                "TOTAL PRODUTOS: " + String.format("%.2f",this.calcularTotalBruto()) + "\n" +
                "----------------------------\n" +
                "TOTAL PEDIDO: " + String.format("%.2f",this.calcularTotal()) + "\n" +
                "----------------------------\n"
        );
    }
}
