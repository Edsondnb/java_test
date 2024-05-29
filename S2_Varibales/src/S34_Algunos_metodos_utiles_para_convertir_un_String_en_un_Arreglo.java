public class S34_Algunos_metodos_utiles_para_convertir_un_String_en_un_Arreglo {

        public static void main(String[] args) {

            String trabalenguas = "trabalenguas";
            System.out.println("trabalenguas.length() = " + trabalenguas.length());
            System.out.println("trabalengua.toCharArray() = " + trabalenguas.toCharArray());

            //********** Arreglo de elementos de tipo char **************
            char[] arraglo = trabalenguas.toCharArray();
            int largo = arraglo.length;
            System.out.println("largo = " + largo);

            for (int i = 0; i < largo; i++){
                System.out.println("arraglo = " + arraglo[i]);
            }

            //***------------ length es una propiedad de un arreglo ---------********
            //***------------ length es un metodo string ---------*******

            //********** Crea arreglo desde el punto de partida de la letra "a" **************
            String[] arreglo2 = trabalenguas.split("a");
            //largo
            int l = arreglo2.length;
            for (int j=0; j<l; j++){
                System.out.println(arreglo2[j]);
            }
            
            String archivo = "Alguna.imagen.png";
            String[] archivoArray = archivo.split("\\."); //[.]
            l = archivoArray.length;
            for (int j=0; j<l; j++){
                System.out.println(archivoArray[j]);
            }

            System.out.println("extension = " + archivoArray[l-1]);
        }




}
