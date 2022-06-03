import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){
        return pessoas.stream()
            .collect(
              groupingBy(
                      Pessoa::getCargo,
                      () -> new TreeMap<>(Comparator.reverseOrder()),
                      Collectors.toCollection(TreeSet::new))
            );

    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(groupingBy(Pessoa::getCargo, counting()));

    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas){
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo,
                                Collectors.groupingBy(
                                        Pessoa::getIdade,
                                        counting()
                                )
                        )
                );
    }



}
