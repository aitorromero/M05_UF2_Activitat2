package m05_uf2_activitat2;

import java.util.ArrayList;
import java.util.Collection;

public class CostPersonal {
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
	static float CostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;
		
		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			
			if (treballador.getTipusTreballador() == Treballador.DIRECTOR ||treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
				costFinal = costFinal + treballador.getNomina();
			} else {
				costFinal = costFinal + treballador.getNomina() + (treballador.getHoresExtres() * 20);
			}
		}
		return costFinal;
	}
}