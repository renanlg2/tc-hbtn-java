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

        for (Iterator<PedidoCookie> pedidoCookie = cookies.iterator(); pedidoCookie.hasNext();){
            if (pedidoCookie.hasNext()){
                PedidoCookie proximoPedido = pedidoCookie.next();
//
                if (proximoPedido.getSabor().equals(sabor)){
                    quantidadeRemovida += proximoPedido.getQuantidadeCaixas();
                    pedidoCookie.remove();
                }
            }
        }

        return quantidadeRemovida;
    }
}
