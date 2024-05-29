public class S30_ValidarUnString {

    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Programacion Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        //********** MAS SEGURA, SOLO DESDE JDK 11 **************
        boolean esBlanco = curso.isBlank();

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido a ".concat(curso));
        }




    }



}
