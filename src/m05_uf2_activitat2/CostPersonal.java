package m05_uf2_activitat2;

import java.util.ArrayList;
import java.util.Collection;

public class CostPersonal extends DadesNoValidesException{
        /**
         * Declarem la clase treballador per a tal d'accedir als seus metodes.
         * Per a cada treballador de l'array treballadors[] l'hi atribuim un 
         * nombre de entre 0 i la longitud màxima de treballadors. 
         * A continuació, si el treballador es DIRECTOR O SUBDIRECTOR 
         * costFinal=costFinal + la nomina del treballador. I si, el treballador
         * no coincideix a cap d'aquests 
         * costFinal=costFinal + (la nomina + les hores extra * 20).
         * I retorna aquest costFinal.
         * @param treballadors
         * @return 
         */
	public float CostDelPersonal(Treballador treballadors[]) throws DadesNoValidesException {
		float costFinal = 0;
                Treballador treballador;

		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			int tipusTreballador = treballador.getTipusTreballador();
                        if(treballador.getNomina()<0 || treballador.getHoresExtres()<0){
                            throw new DadesNoValidesException();
                        }
			if (treballadorExistent(tipusTreballador)) {
                                costFinal = calcularCostFinal(treballador.getNomina(), costFinal);
			} else if(treballador.getTipusTreballador()>1){
                                costFinal = calcularCostFinal(treballador.getNomina(), treballador.getHoresExtres(), costFinal);
			}else{
                            throw new DadesNoValidesException();
                        }
		}
		return costFinal;
	}
        
        public float calcularCostFinal(int nomina, int horesExtra, float costFinal){
            final int preuHora=20;
            return costFinal += nomina + (horesExtra*preuHora);
        }
        
        public float calcularCostFinal(int nomina, float costFinal){
            return  costFinal += nomina;
        }
        
        public boolean treballadorExistent(int tipusTreb){
            return(tipusTreb == Treballador.DIRECTOR || tipusTreb == Treballador.SUBDIRECTOR);
        }
}