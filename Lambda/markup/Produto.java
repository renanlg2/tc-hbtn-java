import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;

    public Supplier<Double> precoComMarkUp = () -> this.preco + (this.preco * this.percentualMarkup / 100);

    public Consumer<Double> atualizarMarkUp = valor -> this.percentualMarkup = valor;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.percentualMarkup = 10;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
