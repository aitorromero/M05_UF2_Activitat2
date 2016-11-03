package m05_uf2_activitat2;

public class Treballador {
    
    final static int DIRECTOR=0;
    final static int SUBDIRECTOR=1; 
    private int tipusTreballador;
    private int nomina;
    private int horesExtra;



    public Treballador(int tipusTreballador, int nomina, int horesExtra) {
        this.tipusTreballador=tipusTreballador;
        this.nomina=nomina;
        this.horesExtra=horesExtra;
    }
    
    public int getTipusTreballador(){
        return this.tipusTreballador;
    }
    
    public int getNomina(){
        return this.nomina;
    }
    
    public int getHoresExtres(){
        return this.horesExtra;
    }
    
}
