import javax.swing.*;

public class S60_Iterando_arreglos_con_sentencia_for_y_palabras_reservadas_break_y_continue {


    public static void main(String[] args) {

        String [] nombres = {"Edson", "Monica", "Pepe", "Luis", "Patricia", "Javier"};
        int contador = nombres.length;

        for (int i = 0; i < contador; i++) {
            if(nombres[i].toLowerCase().contains("edson".toLowerCase()) ||
                    nombres[i].equalsIgnoreCase("javier")){
                continue;                                               //Continua el ciclo
            }
            System.out.println(i + " - " + nombres[i]);
        }

        //Buscando un nombre
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"maria\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " NO existe en la BD");

        }

    }


}
