import java.util.Scanner;

public class S51_1_Tarea_4_Mostrar_ordenados_dos_numeros {

    public static void main(String[] args) {

        int esMayor = 0;
        int esMenor = 0;

        /*Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese el primer numero ");
        int numero1 = sc.nextInt();

        System.out.println(" Ingrese el Segundo numero ");
        int numero2 = sc.nextInt();

        esMayor = numero1 > numero2 ? numero1 : numero2;
        System.out.println("esMayor = " + esMayor);

        esMenor = numero1 < numero2 ? numero1 : numero2;
        System.out.println("esMenor = " + esMenor);*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int numUno = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (numUno > num2) ? numUno + " y " + num2 : num2 + " y " + numUno;

        System.out.println("El orden es: " + resultado);



    }
}
