package Herencia;

public class CostPersonal {
    public double calcularCostTreballadors(Treballador[] treballadors){
        double salarioTotal = 0;
        for (Treballador treballador : treballadors) {
            salarioTotal += treballador.getSalario();
        }
        return salarioTotal;
    }
}
