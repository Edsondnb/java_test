public class S74_Pasar_argumento_por_referencia {


    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("Iniamos el metodo main  = " );
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes ed llamar el metodo test");
        test(edad);
        System.out.println("Despues ed llamar el metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println(" finaliza el metodo main con los datos del arreglo modificados");
    }
    //int
    public static void test(int[] edadArreglo){
        System.out.println("iniciamos el metodo test con = " );
        for (int i = 0; i < edadArreglo.length; i++) {
            edadArreglo[i] = edadArreglo[i] + 20;
        }

            System.out.println("Finaliza el metodo test con = ");
    }


}
