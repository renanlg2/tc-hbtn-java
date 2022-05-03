public class Gerente extends Empregado {
    public Gerente(double salarioFixo){
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()){
            super.valorBonus = (super.salarioFixo * 0.2) + ((departamento.valorAtingidoMeta - departamento.valorMeta) * 0.01);
        } else {
            super.valorBonus = 0;
        }

        return super.valorBonus;
    }
}
