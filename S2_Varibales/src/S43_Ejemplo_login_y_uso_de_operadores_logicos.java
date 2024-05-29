import java.util.Scanner;

public class S43_Ejemplo_login_y_uso_de_operadores_logicos {


    public static void main(String[] args) {
        
        String usarmane = "Edson";
        String password = "12345";

        String usarmane2 = "Admin";
        String password2 = "12345";


        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese su username");
        String usuario = sc.nextLine();

        System.out.println("iNGRESE EL PASSWORD ");
        String pass = sc.nextLine();

        boolean esAutenticado = false;

        if(  (usarmane.equals(usuario) && password.equals(pass)) ||
                (usarmane2.equals(usuario) && password2.equals(pass))){
            esAutenticado = true;

        }else{

            System.out.println(" usurio o constraseña no es correcta");
        }

        if(esAutenticado){
            System.out.println(" Bienvienido usuario ".concat(usuario).concat("!"));
        }else{
            System.out.println(" Requere autenticacion");
        }
        
        
    }
    
    
    
}
