import java.text.SimpleDateFormat;
import java.util.Date;

public class S76_La_clase_Date_y_formatos_de_fechas {

    public static void main(String[] args) {
        
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        /**************************************************************************************/
        /************ S77. Tiempo en milisegundos con método getTime() **********/
        
        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);


    }


}
