public class Empregado {
    public double salarioFixo;
    public double valorBonus;

    public Empregado(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            this.valorBonus = (this.salarioFixo * 10) / 100;
        } else {
            this.valorBonus = 0;
        }

        return this.valorBonus;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return this.salarioFixo + calcularBonus(departamento);
    }
}
