import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class S78_La_clase_Calendar {


    public static void main(String[] args) {

        //clase abstracta
        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023, Calendar.DECEMBER,25,11,30,25);
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);


        Date fehca = calendario.getTime();

        System.out.println("fecha sin formato = " + fehca);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:sss a");
        String fechasinFormato = formato.format(fehca);
        System.out.println("fecha con Formato = " + fechasinFormato);
    }
}
