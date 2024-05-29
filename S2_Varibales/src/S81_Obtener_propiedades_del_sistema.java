import java.util.Properties;

public class S81_Obtener_propiedades_del_sistema {


    public static void main(String[] args) {

        String usermane = System.getProperty("user.name");
        System.out.println("usermane = " + usermane);
        
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "Una linea nueva") ;

        Properties p = System.getProperties();
        p.list(System.out);

    }





}
