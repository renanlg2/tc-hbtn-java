import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros){
        TreeSet<Integer> numerosDuplicados = new TreeSet<Integer>();
        HashSet<Integer> hashNumeros = new HashSet<Integer>();

        for (int numero : numeros){
            if (!hashNumeros.add(numero)){
                numerosDuplicados.add(numero);
            }
        }

        return numerosDuplicados;
    }
}
