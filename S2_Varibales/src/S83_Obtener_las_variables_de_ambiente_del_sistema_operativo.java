import java.util.Map;

public class S83_Obtener_las_variables_de_ambiente_del_sistema_operativo {

    public static void main(String[] args) {

        Map<String, String> varEnvi = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnvi);

        System.out.println(" ---------------------- Listado Variables del Entorno del sistema ------ ");
        for (String key: varEnvi.keySet()) {
            System.out.println("key " + key  + " => " + varEnvi.get(key));
        }

        String usermane = System.getenv("USERNAME");
        System.out.println("usermane = " + usermane);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);


    }




}
