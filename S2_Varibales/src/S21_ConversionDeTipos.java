public class S21_ConversionDeTipos {

    public static void main(String[] args) {

        /*String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98563.25";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "True";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);*/


        //*********** Ejercicios ******************

        /*String texto = "25";
        String texto_1 = "4564564.545";
        String texto_logico = "False";

        int texto_a_entero = Integer.parseInt(texto);
        System.out.println(texto_a_entero);

        double texto_a_double = Double.parseDouble(texto_1);
        System.out.println(texto_a_double);

        boolean logico_a_boolean = Boolean.parseBoolean(texto_logico);
        System.out.println(logico_a_boolean);*/



        /**************************************************************************************/
        /******************S22. Conversiones de tipo primitivos a cadenas**********************/

        /*int numeroAString = 100;
        System.out.println("numeroAString = " + numeroAString);

        String numero2Str = Integer.toString(numeroAString);
        System.out.println("numero2Str = " + numero2Str);

        //**********Sobrecarga de metodos**************

        numero2Str = String.valueOf(numeroAString);
        System.out.println("numero2Str = " + numero2Str);

        double numeroRealDouble = 1.2456;
        String numeroReal = Double.toString(numeroRealDouble);
        System.out.println("numeroReal = " + numeroReal);

        numeroReal = String.valueOf(1.23456f);
        System.out.println("numeroReal = " + numeroReal);*/

        //*********** Ejercicios ******************
        
        int numero = 100;
        double numero2 = 100.252;
        double numero3 = 6.058;

        String numero_a_texto = Integer.toString(numero);
        System.out.println(numero_a_texto);

        String real_a_texto = Double.toString(numero2);
        System.out.println(real_a_texto);

        real_a_texto = String.valueOf(numero);
        System.out.println(real_a_texto);

        String realDouble_a_texto = Double.toString(numero3);
        System.out.println(realDouble_a_texto);

        realDouble_a_texto = String.valueOf(1.23456f);
        System.out.println(realDouble_a_texto);



        /**************************************************************************************/
        /******************S23. Conversiones entre tipos primitivos**********************/

        /*int i = 1000;

        //**********CAST (FORZAR CONVERSION)**************
        short s = (short) i;
        System.out.println("s = " + s);

        float f = (float) i;
        System.out.println("f = " + f);*/


    }


}
