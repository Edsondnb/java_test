public class S64_2_Ejemplo_busqueda_de_palabras {

    public static void main(String[] args) {

       String texto = "Tengo una gallina pinta, pipiripinta, pipirialegre y gorda, que tiene tres pollitos pintos, pipiripintos, " +
               "pipirialegres y gordos. Si la gallina no hubiera sido pinta pipiripinta, pipirialegre y gorda; los pollitos no hubieran sido pintos, pipiripintos, pipirialegres y gordos.";
       String palabra = "pipirialegre";

       int maxTexto = texto.length();
       int maxPalabra = palabra.length();
       int cantidad = 0;

       buscar:
       for(int i = 0; i < texto.length(); i++){
           int k = i;
           for(int j = 0; j < maxPalabra; j++){
                if(texto.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
          }
          cantidad++;
       }
        System.out.println("Encontrado: " + cantidad + " veces la palabra = " + palabra);


    }


}
