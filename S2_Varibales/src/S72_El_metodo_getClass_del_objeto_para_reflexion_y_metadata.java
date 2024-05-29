import java.lang.reflect.Method;

public class S72_El_metodo_getClass_del_objeto_para_reflexion_y_metadata {


    public static void main(String[] args) {
        /*getClass = tienen todo los objetos de java, hereda del objeto Object,
        ver la estructura interna del objeto
         */

        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intCLass = num.getClass();
        Class objClass = intCLass.getSuperclass().getSuperclass();
        System.out.println("intCLass.getSimpleName() = " + intCLass.getSimpleName());
        System.out.println("intCLass.getSimpleName() = " + intCLass.getSuperclass());
        System.out.println("intCLass.getSuperclass().getSuperclass() = " + objClass);

        for (Method metodo: objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }




}
