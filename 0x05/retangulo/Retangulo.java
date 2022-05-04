public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public double getLargura(){
        return this.largura;
    }

    public void setLargura(double largura) {
        if (largura >= 0){
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        if (altura >= 0){
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("ltura deve ser maior ou igual a 0");
        }
    }


}
