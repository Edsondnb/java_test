public class S33_Obtener_la_extension_de_un_archivo {

    public static void main(String[] args) {

        String archivo = "Alguna_imagen.aviff";
        int i = archivo.lastIndexOf(".");


        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " +
                archivo.substring(i+1));

    }

}
