import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> lista, Predicate<Produto> criterioFiltro){
        List<Produto> listaFiltrada = new ArrayList<>();

        lista.forEach(produto -> {
            if(criterioFiltro.test(produto))
                listaFiltrada.add(produto);
        });

        return listaFiltrada;
    }
}
