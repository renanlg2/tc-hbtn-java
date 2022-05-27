import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> lista, CriterioFiltro criterioFiltro){
        List<Produto> listaFiltrada = new ArrayList<>();

        lista.forEach(produto -> {
            if(criterioFiltro.testar(produto))
                listaFiltrada.add(produto);
        });

        return listaFiltrada;
    }
}
