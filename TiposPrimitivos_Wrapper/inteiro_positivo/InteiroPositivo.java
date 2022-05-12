public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor){
        setValor(valor);
    }

    public InteiroPositivo(String valor){
        setValor(new Integer(valor));
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor >= 0){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo(){
        if (this.valor == 1) {
            return false;
        }

        boolean ehPrimo = true;

        for (int i = 2; i < this.valor; i++ ){
            if (this.valor % i == 0){
                ehPrimo = false;
                break;
            }
        }

        return ehPrimo;
    }
}

