package Herencia;

public class CostPersonal {
    public double costDelPersonal(Treballador[] treballadors){
        double salarioTotal = 0;
        for (Treballador treballador : treballadors) {
            salarioTotal += treballador.getSalario();
        }
        return salarioTotal;
    }
}
