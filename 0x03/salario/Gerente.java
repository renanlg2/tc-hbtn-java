public class Gerente extends Empregado {
    public Gerente(double salarioFixo){
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()){
            super.valorBonus = ((super.salarioFixo * 20) / 100) + ((departamento.valorAtingidoMeta - departamento.valorMeta) / 100);
        } else {
            super.valorBonus = 0;
        }

        return super.valorBonus;
    }
}
