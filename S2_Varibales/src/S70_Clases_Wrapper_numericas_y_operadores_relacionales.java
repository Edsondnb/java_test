public class S70_Clases_Wrapper_numericas_y_operadores_relacionales {

    public static void main(String[] args) {


        Integer num1 = Integer.valueOf(1200);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        //num2 = 1000;
        num2 = 127;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //***------------ por las clases wrapper o referencias se iguala
        //          al objeto no al valor por lo tanto num2
        // = 1000 es false por se primitivo ---------
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("Son el mismo objeto? " + (num1.equals(num2)));
        System.out.println("Son el mismo objeto? " + (num1.intValue()  == num2.intValue()));

        num2 = 2000;            //.intValue()
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);


    }

}
