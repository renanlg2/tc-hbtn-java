import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    public String titulo;
    public String autor;
    public double preco;


    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        if (titulo.length() >= 3) {
            setTitulo(titulo);
        } else {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }

        if (autor.contains(" ")) {
            setAutor(autor);
        } else {
            throw new AutorInvalidoException("Nome de autor invalido");
        }

        if (preco > 0) {
            setPreco(preco);
        } else {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
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

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
