import java.util.Scanner;

public class S54_Flujo_de_control_if_else_ejemplo_year_bisiesto {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese el numero del mes 1 - 12");
        int mes = sc.nextInt();

        int numeroDias= 0;
        System.out.println(" Ingrese el año (yyyy) ");
        int year = sc.nextInt();

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (year % 400 == 0 || ( (year % 4 == 0) && !(year % 100 == 0))){
                numeroDias = 29;
            }else {
                numeroDias = 28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);

    }


}
