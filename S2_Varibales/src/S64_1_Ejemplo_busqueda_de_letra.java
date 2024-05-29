public class S64_1_Ejemplo_busqueda_de_letra {

    public static void main(String[] args) {

        String nombreCompleto = "Lucia Danielle Jurado Arribasplata";

        String nombreMinusculas = nombreCompleto.toLowerCase();
        int nombreMax = nombreMinusculas.length();
        char letra = 'l';
        int contadorLetras = 0;

        for(int i = 0; i < nombreMax; i++){
            if(nombreMinusculas.charAt(i) != letra){
               continue;
            }
            contadorLetras++;
        }

        System.out.println(contadorLetras);
    }


}
