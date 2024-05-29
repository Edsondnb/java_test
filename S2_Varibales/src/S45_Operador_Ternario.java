import java.util.Scanner;

public class S45_Operador_Ternario {


    public static void main(String[] args) {


    //***------------  Version simplificada del if, else y siempre devuelve un valor---------********

        //varibale = condicion ? si es verdadero: si es_falso

        String variable = 7 == 7 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);




        String estado = "";
        double promedio = 5.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0: ");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0: ");
        historia = sc.nextDouble();


        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Desaprobado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);




    }

}
