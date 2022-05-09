import provedores.Frete;

public class Pedido {
    private int codigo;
    private double peso;
    private double total;
    private Frete frete;

    public Pedido(int codigo, double peso, double total){
        setCodigo(codigo);
        setPeso(peso);
        setTotal(total);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTotal(){
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Frete getFrete() {
        return this.frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
