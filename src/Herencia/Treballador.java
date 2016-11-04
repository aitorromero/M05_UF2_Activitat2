package Herencia;

public abstract class Treballador {
    double salario;

    public Treballador(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public abstract void estoAbs();
    
}
