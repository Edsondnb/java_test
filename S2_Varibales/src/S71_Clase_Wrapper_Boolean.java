public class S71_Clase_Wrapper_Boolean {

    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2; //false
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBolean3 = false;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println(" comparando dos onjetos boolean " + (objetoBoolean == objetoBoolean2));
        System.out.println(" comparando dos onjetos boolean " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println(" comparando dos onjetos boolean " + (objetoBoolean == objetoBoolean2));
        System.out.println(" comparando dos onjetos boolean " + (objetoBoolean == objetoBolean3));

        //obtenemos el valor booleano primitivo
        boolean primitivoBoolean2 = objetoBoolean2.booleanValue();
        boolean primitivoBoolean3 = objetoBoolean2;
        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);
    }
}
