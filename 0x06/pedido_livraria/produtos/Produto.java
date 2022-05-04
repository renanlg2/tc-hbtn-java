package produtos;

public abstract class Produto {
    protected String titulo;
    protected int ano;
    protected String pais;
    protected double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto){
        setTitulo(titulo);
        setAno(ano);
        setPais(pais);
        setPrecoBruto(precoBruto);
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getPais(){
        return this.pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public double getPrecoBruto(){
        return this.precoBruto;
    }

    public void setPrecoBruto(double precoBruto){
        this.precoBruto = precoBruto;
    }

    public abstract double obterPrecoLiquido();


}
