import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> dadosPessoais;

    public ListaTelefonica() {
        this.dadosPessoais = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone){
        HashSet<Telefone> telefoneLista;

        // Get the Telefone HashSet list
        telefoneLista = dadosPessoais.get(nome);

        // Validate if HashSet was created
        if (telefoneLista == null) {
            telefoneLista = new HashSet<Telefone>();
        }

        // Validate if the number exists to this name
        if (telefoneLista.contains(telefone))
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");

        // Validate if the number exists to another people
        Iterator< HashSet<Telefone> > iteratorTelefone = dadosPessoais.values().iterator();
        while (iteratorTelefone.hasNext()){
            for ( Telefone telIndividual : iteratorTelefone.next()){
                if (telIndividual.equals(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }

        telefoneLista.add(telefone);
        dadosPessoais.put(nome, telefoneLista);

        return telefoneLista;
    }

    public HashSet<Telefone> buscar(String nome){
        HashSet<Telefone> telefoneLista = dadosPessoais.get(nome);

        if (telefoneLista != null)
            return telefoneLista;

        return null;
    }
}
