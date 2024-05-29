public class S49_Operador_Instanceof_con_tipos_abstractos {


    public static void main(String[] args) {

        /***------- Class Object es la raíz de la jerarquía de clases.
         * Cada clase tiene Object como una superclase.
         Todos los objetos, incluidas las matrices, i
         mplementan los métodos de esta clase.------********/

        Object texto = "Creando un objeto de la clase String ... ";

        Number num = 7;

        Boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String =" + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es un Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es un Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es un Object = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("Es tipo Boolean = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Double;
        System.out.println("Es del tipo Float = " + b1);
    }
}
