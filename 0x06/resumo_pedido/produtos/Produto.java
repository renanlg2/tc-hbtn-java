package produtos;

public abstract class Produto {
    protected String titulo;
    protected int ano;
    protected String pais;
    protected double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto){
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getPais(){
        return this.pais;
    }

    public double getPrecoBruto(){
        return this.precoBruto;
    }

    public abstract double obterPrecoLiquido();

}
