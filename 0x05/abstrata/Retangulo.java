public class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;

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
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
    }

    @Override
    public double area(){
        return this.getLargura() * this.getAltura();
    }

    @Override
    public String toString(){
        return "[Retangulo] " + String.format("%.2f", this.getLargura()) + " / " + String.format("%.2f",this.getAltura());
    }


}
