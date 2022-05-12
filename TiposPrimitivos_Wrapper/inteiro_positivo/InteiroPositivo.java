public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) throws IllegalArgumentException{
        this.setValor(valor);
    }

    public InteiroPositivo(String valor) throws IllegalArgumentException{
        this.setValor(Integer.parseInt(valor)); // Convertendo String para int com Wrapper
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) throws IllegalArgumentException{
        if (valor < 0)
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");

        this.valor = valor;
    }

    public boolean ehPrimo(){
        if (this.valor <= 1)
            return false;

        for (int i = 2; i < this.valor; i++ ){
            if (this.valor % i == 0){
                return false;
            }
        }

        return true;
    }
}

