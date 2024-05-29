import javax.swing.*;

public class S51_3_Obtener_el_nombre_mas_largo_de_tres_personas {


    public static void main(String[] args) {

        String nombre1, nombre2, nombre3;


        nombre1 = JOptionPane.showInputDialog("Ingrese el primer Nombre y Apellido");
        nombre2 = JOptionPane.showInputDialog("Ingrese el segundo Nombre y Apellido");
        nombre3 = JOptionPane.showInputDialog("Ingrese el tercer Nombre y Apellido");



        String nombreCompleto = nombre1;
        String nombreCompleto2 = nombre2;
        String nombreCompleto3 = nombre3;

        String[] seperandoNombre = nombreCompleto.split(" ");
        String[] seperandoNombre2 = nombreCompleto2.split(" ");
        String[] seperandoNombre3 = nombreCompleto3.split(" ");

        String parte1 = seperandoNombre[0];
        String parte2 = seperandoNombre2[0];
        String parte3 = seperandoNombre3[0];

        if( parte1.length() > parte2.length() && parte1.length() > parte3.length()){
            System.out.println("El nombre " + nombre1 + " es más largo");
        } else if ( parte2.length() >  parte1.length() && parte2.length() > parte3.length()) {
            System.out.println("El nombre " + nombre2 + " es más largo");
        }else {
            System.out.println("El nombre " + nombre3 + " es más largo");

        }



//        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
//        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
//        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
//
//        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
//        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;
//
//        System.out.println("La persona con el nombre mas largo es " + max);



    }


}
