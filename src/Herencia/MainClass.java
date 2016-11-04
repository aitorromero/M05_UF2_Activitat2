package Herencia;

public class MainClass {
    public static void main(String[] args) {
        Treballador[] treb = new Treballador[3];
        CostPersonal cp = new CostPersonal();
        treb[0] = new SoldadoRaso(1000, 2);
        treb[1] = new Director(1600);
        treb[2] = new Subdirector(2000);
        
        System.out.println(cp.calcularCostTreballadors(treb));
        
    }
}
