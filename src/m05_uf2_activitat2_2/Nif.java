package m05_uf2_activitat2_2;


public class Nif {
    
    private String nif;

    
    public void esValid() {

        char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int num = 0;
        String letra;
        String numero;
        int longitudCadena1=8;
        int longitudCadena2=9;

        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);

        // primer mirem que la cadena tingui 8 o 9 caràcters:

        if (nif.length() < longitudCadena1 || nif.length() > longitudCadena2) {
            System.err.println("Format Incorrecte");
        } // Després mirem que el número sigui convertible a enter.
        else {
            try {
                num = Integer.parseInt(numero);

                if (String.valueOf(llista[num % 23]).equals(letra)) {
                    System.err.println("Nif Vàlid");
                } else {
                    System.err.println("Nif Invàlid");
                }
            } catch (NumberFormatException e) {
                System.err.println("Format Incorrecte");
            }

        }
    
    }
}
