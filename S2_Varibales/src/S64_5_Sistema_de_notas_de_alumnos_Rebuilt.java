import java.util.Scanner;

public class S64_5_Sistema_de_notas_de_alumnos_Rebuilt {

    /*

    Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
    Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
    Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------- Sistema de notas finales ----------------");


        int contadorIgualAUno = 0;

        int contadorMayorACinco = 0;
        double sumaMayorACinco = 0;
        double promedioMayorACinco = 0;

        int contadorMenorACuatro = 0;
        double sumaMenorACuatro = 0;
        double promedioMenorACuatro = 0;

        boolean error = false;


        for (int i = 0; 20 > i; i++){
            System.out.println("Ingrese la nota N°" + (i + 1) + " :");
            double notas = sc.nextDouble();

            if(notas < 0 || notas > 7){
                System.out.println("Ingrese una nota menor o igual a 7");
                i--;
            }else if (notas == 0){
                System.out.println("La nota no puede ser igual a 0");
                error = true;
                break;
            }else{

                if(notas == 1){
                    contadorIgualAUno++;
                }

                if(notas > 5){
                    sumaMayorACinco+= notas;
                    contadorMayorACinco++;

                }

                if(notas < 4){
                    sumaMenorACuatro = sumaMenorACuatro + notas;
                    contadorMenorACuatro++;

                }

            }
        }


        if(contadorMayorACinco > 0){
            promedioMayorACinco = sumaMayorACinco / contadorMayorACinco;
        }

        if(contadorMenorACuatro < 4){
            promedioMenorACuatro = sumaMenorACuatro / contadorMenorACuatro;
        }


        if(!error){
            System.out.println("Valores iguales a UNO: " + contadorIgualAUno);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("cantidad de valores mayores a CINCO: " + contadorMayorACinco);
            System.out.println("El promedio mayor a CINCO es: " + promedioMayorACinco);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("cantidad de valores mayores a CUATRO: " + contadorMenorACuatro);
            System.out.println("El promedio menor a CUATRO es: " + promedioMenorACuatro);
        }else{
            System.out.println("Sistema cerrado");
        }









    }
}
