import java.io.IOException;

public class S85_La_clase_Runtime_para_ejecutar_aplicaciones_del_SO {


    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso ;



            try {
                if(System.getProperty("os.name").toLowerCase().startsWith("Windows")) {
                    proceso = rt.exec("notepad");
                }else {
                    proceso = rt.exec("notepad");
                }
                //espera a hasta que cerremos el  programa
                proceso.waitFor();
            } catch (Exception e) {
                System.err.println("El comando es desconocido " + e.getMessage());
                System.exit(1);
            }
            System.out.println(" Se ha cerrado el editor");
            System.exit(0);
        }
    }


