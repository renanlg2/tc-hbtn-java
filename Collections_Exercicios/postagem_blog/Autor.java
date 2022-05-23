import java.util.Comparator;
import java.util.Objects;

public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor autorObj) {
        return this.getNome().compareTo(autorObj.getNome());
    }

    @Override
    public boolean equals(Object autorObj) {
        if (autorObj == null) return false;
        if (this == autorObj) return true;
        if (this.getClass() != autorObj.getClass()) return false;

        Autor autor = (Autor) autorObj;
        return this.getNome() != null
                && this.getNome().equals(autor.getNome())
                && this.getSobrenome() != null
                && this.getSobrenome().equals(autor.getSobrenome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
