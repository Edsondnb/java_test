public class S55_Flujo_de_control_swich_case {


    public static void main(String[] args) {
        char num = '3';

        switch (num){
            case '0':
                System.out.println(" el num es 0");
                break;
            case '1':
            System.out.println(" el num es 1");
                break;
            case '2':
            System.out.println(" el num es 2");
                break;
            case '3':
            System.out.println(" el num es 3");
                break;
            default:
                System.out.println(" caracter desconocido");
        }


        String nombre = "pedr";

        switch (nombre){

            case "admin":
                System.out.println(" Bienvenido admin" );
                break;
            case "Edson":
                System.out.println(" Hola Edson");
                break;
            default:
                System.out.println(" Usuario desconocido");

        }

    }
}
