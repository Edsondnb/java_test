import java.util.Scanner;

public class S64_4_calcular_el_numero_mayor_de_multiples_valores {

    /*

    Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10
    valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar,
    luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el
    numero entero, entonces se requiere:
    Calcular el menor número e imprimir el valor.
    Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no,
    imprimir " el numero menor es igual o mayor que 10!".

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de valores que desea comparar: ");
        int cantidadNuneros = sc.nextInt();

        if(cantidadNuneros < 5){
            System.out.println("Debe ingresar al menos 5 numeros");
        }

        //creamos una variable y la incializamos con un valor minimo para ir comparando el siguiente numero
        int numeroMayor = Integer.MIN_VALUE;



        for (int i = 0; i < cantidadNuneros; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + " : ");
            int numeroIngresado = sc.nextInt();

            //comparamos el numero ingresado
            if(numeroIngresado > numeroMayor){
                numeroMayor = numeroIngresado;
            }

        }

        System.out.println("EL numero mayor es = " + numeroMayor);






    }
}
