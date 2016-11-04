package Herencia;

public class Director extends Treballador{
    
    public Director(double salario) {
        super(salario);
    }

    @Override
    public void estoAbs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
