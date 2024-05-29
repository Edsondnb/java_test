import java.util.Scanner;

public class S46_Ejemplo_login_con_operador_ternario {


    public static void main(String[] args) {

        String[] usernames = {"Edson", "Admin", "pepe"};
        String[] passwords = {"123", "1234", "1235"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su Username");
        String usuario = sc.nextLine();

        System.out.println("Ingrese el Password ");
        String pass = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){                                             //defecto flase
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(pass))? true : esAutenticado;
            /*if( usernames[i].equals(usuario) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido Usuario ".concat(usuario).concat("!")
                        : "Requiere autenticacion";
        System.out.println("mensaje = " + mensaje);

        /*if(esAutenticado){
            System.out.println(" Bienvienido usuario ".concat(usuario).concat("!"));
        }else{
            System.out.println("Requiere autenticacion");
            System.out.println("usuario o constraseña no es correcta");
        }*/



    }








}
