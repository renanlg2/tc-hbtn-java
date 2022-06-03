import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        Comparator<String> c = Comparator.reverseOrder();

        return
            pessoas
            .stream()
            .collect(
              Collectors.groupingBy(
                      Pessoa::getCargo,
                      () -> new TreeMap<>(c),
                      Collectors.toCollection(TreeSet::new))
            );

    }



}
