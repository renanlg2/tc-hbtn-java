public class InteiroPositivo {
    private Integer valor;

    public InteiroPositivo(int valor){
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public InteiroPositivo(String valor){
        Integer valorInt = new Integer(valor);
        setValor(valorInt);
    }

    public void setValor(int valor) {
        if (valor >= 0){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo(){
        if (this.valor == 1){
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
