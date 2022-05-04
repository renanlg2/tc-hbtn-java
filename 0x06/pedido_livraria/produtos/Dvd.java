package produtos;

public class Dvd extends Produto{
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao){
        super(titulo, ano, pais, precoBruto);
        setDiretor(diretor);
        setGenero(genero);
        setDuracao(duracao);
    }

    public String getDiretor(){
        return this.diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getDuracao(){
        return this.duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public double obterPrecoLiquido(){
        return super.getPrecoBruto() + (super.getPrecoBruto() * 0.20);
    }


}
