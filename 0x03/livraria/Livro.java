import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }

        this.titulo = titulo;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        String[] nomeSobrenome = autor.split("\\s");

        if (nomeSobrenome.length < 2){
            throw new AutorInvalidoException("Nome de autor invalido");
        }

        this.autor = autor;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco == 0){
            throw new LivroInvalidoException("Preco de livro invalido");
        }

        this.preco = preco;
    }
}
