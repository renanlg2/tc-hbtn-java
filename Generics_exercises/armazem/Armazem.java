import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T>{
    private Map<String, T> listaArmazem;

    public Armazem() {
        this.listaArmazem = new HashMap<String, T>();
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.listaArmazem.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.listaArmazem.get(nome);
    }
}
