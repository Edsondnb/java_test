public class S69_Autoboxing_y_unboxing {

    public static void main(String[] args) {

        //***------------ autoboxing = de referencia a primitivo, unboxin vioceverza  ---------********

        //suma de numeros pares
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;
        int sumaImpar = 0;
        int sumarTodo = 0;

        for(Integer i : enteros){
            sumarTodo += i;
        }

        System.out.println(sumarTodo);

        for (Integer i : enteros) {
            if (i.intValue() % 2 == 0) {

                suma += i.intValue();
            }
        }
        System.out.println("suma de numeros pares= " + suma);


        for (Integer i : enteros){
            if(i % 2 != 0){
                sumaImpar += i;
            }
        }
        System.out.println("suma de numero impares: " + sumaImpar);

        //de forma automatica
        suma = 0;
        for (Integer i : enteros) {
            if (i % 2 == 0) {

                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
    }

}
