import java.util.Scanner;

public class S44_Ejemplo_login_usando_arreglos {


    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Edson";
        passwords[0] = "12345";

        usernames[1] = "Admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"Edson", "Admin", "pepe"};
        String[] passwords = {"123", "1234", "1235"};


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su Username");
        String usuario = sc.nextLine();

        System.out.println("Ingrese el Password ");
        String pass = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if( usernames[i].equals(usuario) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }
        }



        if(esAutenticado){
            System.out.println(" Bienvienido usuario ".concat(usuario).concat("!"));
        }else{
            System.out.println("Requiere autenticacion");
            System.out.println("usuario o constraseña no es correcta");
        }



    }
}
