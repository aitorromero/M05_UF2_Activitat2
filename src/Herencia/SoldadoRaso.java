package Herencia;

public class SoldadoRaso extends Treballador{
int horesExtra;
final int precioHoras = 20;

    public SoldadoRaso(double salario, int horesExtra) {
        super(salario);
        this.horesExtra = horesExtra;
        
    }

    @Override
    public double getSalario() {
        return super.getSalario()+horesExtra*precioHoras;
    }

    @Override
    public void estoAbs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
