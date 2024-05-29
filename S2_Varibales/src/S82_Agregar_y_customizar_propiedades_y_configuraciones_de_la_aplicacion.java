import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class S82_Agregar_y_customizar_propiedades_y_configuraciones_de_la_aplicacion {


    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p =new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto propesties");


            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e) {
            System.out.println("No exite el archivo = " + e);
        }

    }

}
