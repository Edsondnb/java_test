public class S48_Operador_Instanceof_Tipo_de {


    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String ... ";
        Integer num = 7;


        Boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String =" + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = num instanceof  Integer;
        System.out.println("num es un Integer = " + b1);

        b1 = num instanceof  Number;
        System.out.println("num es un Number = " + b1);

        b1 = num instanceof  Object;
        System.out.println("num es un Object = " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("Es tipo Boolean = " + b1);

    }
}
