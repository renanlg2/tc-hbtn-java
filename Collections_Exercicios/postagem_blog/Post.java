import java.util.Objects;

public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return this.getTitulo();
    }

    @Override
    public boolean equals(Object postObj) {
        if (postObj == null) return false;
        if (this == postObj) return true;
        if (this.getClass() != postObj.getClass()) return false;

        Post post = (Post) postObj;
        return this.getAutor() != null
                && this.getAutor().equals(post.getAutor())
                && this.getTitulo() != null
                && this.getTitulo().equals(post.getTitulo());
    }

    @Override
    public int hashCode() {
//        int hash = 7;
//        hash = 31 * hash + Objects.hashCode(this.getAutor());
//        hash = 31 * hash + Objects.hashCode(this.getTitulo());
        return Objects.hashCode(this.getTitulo());
    }

    @Override
    public int compareTo(Post post) {
        return this.getTitulo().compareTo(post.getTitulo());
    }
}
