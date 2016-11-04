package m05_uf2_activitat2_2;


public class Nif {
    
    private String nif;
    private String missatge;
    private char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    
    public void esValid() {

        
        int num = 0;
        String letra;
        String numero;

        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);

        // primer mirem que la cadena tingui 8 o 9 caràcters:

        if (longitudCadena(nif.length())) {
            missatge = "Format Incorrecte";
        } // Després mirem que el número sigui convertible a enter.
         else {
            try {
                num = Integer.parseInt(numero);

                if (comprobarLetraDni(num, letra)) {
                    missatge =  "Nif Vàlid";
                } else {
                    missatge = "Nif Invàlid";
                }

            } catch (NumberFormatException e) {
                missatge = "Format Incorrecte";
            }
    
        }
    }
    public boolean longitudCadena(int nif){
        int longitudCadena1=8;
        int longitudCadena2=9;
        return (nif < longitudCadena1 || nif > longitudCadena2);
    }
    
    public boolean comprobarLetraDni (int num, String letra){
        
        return (String.valueOf(llista[num % llista.length]).equals(letra));
    }

}
