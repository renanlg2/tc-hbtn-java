import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto{
    private String nome;
    private double preco;
    private double percentualMarkUp;

    public Supplier<Double> precoComMarkUp = () -> this.preco + (this.preco * this.percentualMarkUp / 100);

    public Consumer<Double> atualizarMarkUp = (Double valor) -> this.percentualMarkUp = valor;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.percentualMarkUp = 10;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}