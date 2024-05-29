import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class S79_Convertir_una_fecha_String_a_objeto_del_tipo_Date {


    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese la fecha con formato 'yyyy-MM-dd'");

        try {

            Date  fecha = format.parse(sc.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            /**************************************************************************************/
            /****************** S80. Comparar fechas**********************/
            //fecha actual
            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es mayor que la fecha2 (Actual)");

            } else if (fecha.before(fecha2)) {
                System.out.println("la fecha ingresada es anterior que fecha2 (Actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual afecha2");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es mayor que la fecha2 (Actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("la fecha ingresada es anterior que fecha2 (Actual)");
            }else if (fecha.compareTo(fecha2) ==0 ){
                System.out.println("Fecha es igual afecha2");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }


}
