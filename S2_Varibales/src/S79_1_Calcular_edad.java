import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class S79_1_Calcular_edad {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese su fecha de nacimiento 'yyyy-MM-dd'");


        Date fechaActual = new Date();

        try {
            Date fechaIngresada = formato.parse(sc.nextLine());
            int edad = fechaActual.getYear() - fechaIngresada.getYear();

            System.out.println("fechaIngresada = " + edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


//        Scanner scanner = new Scanner(System.in);
//
//                System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
//                String fechaStr = scanner.next();
//
//                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//                Date fechaNacimiento = df.parse(fechaStr);
//                Date actual = new Date();
//
//                // creamos un patron de fecha numérico con el año mes y día
//                df = new SimpleDateFormat("yyyyMMdd");
//
//                // luego convertimos ambas fechas la actual y la fecha de nacimiento
//                // en enteros que contiene el año mes y día
//                int desde = Integer.parseInt(df.format(fechaNacimiento));
//                int hasta = Integer.parseInt(df.format(actual));
//
//                // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
//                // dejar la fecha en decenas o centenas
//                int edad = (hasta - desde) / 10000;
//                System.out.println("La edad es: " + edad);




    }


}

