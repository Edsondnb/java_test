import java.util.Scanner;

public class S64_3_calcular_el_numero_menor_de_multiples_valores {

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

        System.out.println("Ingrese la cantidad de numero que desea comparar: ");
        int cantNumeros = sc.nextInt();

        if(cantNumeros < 10){
            // Inicializamos con el valor máximo posible
            System.out.println("Debe ingresar al menos 10 numeros");
            return;
        }

        int numeroMenor = Integer.MAX_VALUE;

        for(int i = 0; i < cantNumeros; i++){
            System.out.println("Ingrese el numero " + (i +  1) + ": ");
            int numero = sc.nextInt();

            if(numero < numeroMenor){
                numeroMenor = numero;
            }
        }

        System.out.println("El numero menor es: " + numeroMenor);

        if(numeroMenor < 10){
            System.out.println("El numero menor es menor que 10!");
        }else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }





    }
}
