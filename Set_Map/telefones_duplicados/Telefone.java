import java.util.Objects;
import java.util.TreeSet;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return this.getCodigoArea() != null &&
               this.getNumero() != null &&
               this.getCodigoArea().equals(telefone.getCodigoArea()) &&
               this.getNumero().equals(telefone.getNumero());
    }

    @Override
    public int hashCode() {
        // Reference: https://youtu.be/7V3589CReug?t=332
        // I needed to use the code bellow to make a correct output
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }
}
