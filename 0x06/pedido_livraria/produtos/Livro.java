package produtos;

public class Livro extends Produto {
    private int paginas;
    private String autor;
    private int edicao;

    public double obterPrecoLiquido(){
        return super.getPrecoBruto() + (super.getPrecoBruto() * 0.15);
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getEdicao(){
        return this.edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao){
        super(titulo, ano, pais, precoBruto);
        setPaginas(paginas);
        setAutor(autor);
        setEdicao(edicao);
    }

}
