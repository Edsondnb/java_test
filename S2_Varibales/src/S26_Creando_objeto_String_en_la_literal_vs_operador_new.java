public class S26_Creando_objeto_String_en_la_literal_vs_operador_new {

    public static void main(String[] args) {

        String curso = "Progranacion Java";
        String curso2 = new String("progranacion Java");
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);


        //**********COMPARA EL VALOR NO EL OBJETO**************
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //**********NO USADO**************
        String curso3 = "Progranacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
