import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
    private List <T> listaMidia;
    public Biblioteca() {
        listaMidia = new ArrayList<>();
    }
    public void adicionarMidia(T midia){
        this.listaMidia.add(midia);
    }

    public List<? extends Midia> obterListaMidias(){
        return this.listaMidia;
    }

}
