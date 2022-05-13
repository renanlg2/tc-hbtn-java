import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies = new ArrayList<PedidoCookie>();

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int quantidadeTotal = 0;

        for (PedidoCookie pedidoCookie : cookies){
            quantidadeTotal += pedidoCookie.getQuantidadeCaixas();
        }

        return quantidadeTotal;
    }

    public int removerSabor(String sabor){
        int quantidadeRemovida = 0;

        Iterator<PedidoCookie> pedidoIterator = this.cookies.iterator();

        while (pedidoIterator.hasNext()){
            PedidoCookie pedidoAtual = pedidoIterator.next();
            if (pedidoAtual.getSabor().equals(sabor)){
                quantidadeRemovida += pedidoAtual.getQuantidadeCaixas();
                pedidoIterator.remove();
            }
        }

        return quantidadeRemovida;
    }
}
