import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Scanner;

public class S64_Menu_de_opciones_iterativo {


    public static void main(String[] args) {

        int opcionIndice = 0;


        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());

            switch (opcionIndice){
                case 1 : {
                    JOptionPane.showMessageDialog(null,"Usuario actualizado");
                }
                case 2 : {
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado" );
                }
                case 3 : {
                    JOptionPane.showMessageDialog(null, "Usuario Agregado");
                }
                case 4 : {
                    JOptionPane.showMessageDialog(null, "Listado de Usuarios");
                }
                case 5 : {
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                }
            }
        }






    }

}
