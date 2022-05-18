import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> dadosPessoais;

    public ListaTelefonica() {
        this.dadosPessoais = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone){
        ArrayList<Telefone> telefoneLista = dadosPessoais.get(nome);

        if (telefoneLista == null){
            telefoneLista = new ArrayList<Telefone>();
            telefoneLista.add(telefone);
            dadosPessoais.put(nome, telefoneLista);
        } else {
            if (!telefoneLista.contains(telefone))
                telefoneLista.add(telefone);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
        ArrayList<Telefone> telefoneLista = dadosPessoais.get(nome);

        if (telefoneLista != null)
            return telefoneLista;

        return null;
    }
}
