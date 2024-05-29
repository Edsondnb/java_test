public class S64_Ejemplo_buscar_con_sentencias_for_anidadas_y_etiquetas {


    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres comen trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;
        char letra = 'e';

        buscar:
        for (int i = 0; i <= maxFrase; ) {
            //variable para recorrer la frase(i) sin afectarla
            int k = i;
            //recorre la frase para encontrar la palabra
            for (int j = 0; j < maxPalabra; j++){
                         //leyendo cada caracter
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            };

            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Enctrado = " + cantidad + " veces el caracter '" + palabra + "' en la frase");




    }
}
