import java.util.Scanner;

public class S64_6_Multiplicar_Dos_Numero_Sin_Simbolo_De_Multiplicacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        boolean numeroNegativo = (numero < 0 && numero2 > 0) || (numero > 0 && numero2 <0);

        numero = Math.abs(numero);
        numero2 = Math.abs(numero2);

        int resultado = 0;

        for (int i = 0; i < numero2; i++) {
            resultado += numero;
        }


        if(numeroNegativo){
            resultado = -resultado;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);



    }
}
