public class Quadrado extends Retangulo{
    private double lado;

    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        if (lado >= 0){
            this.lado = lado;
            super.setLargura(lado);
            super.setAltura(lado);
        } else {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }

    }

    @Override
    public String toString(){
        return "[Quadrado] " + String.format("%.2f", getLado());
    }

    public double area(){
        return Math.pow(getLado(), 2);
    }


}
