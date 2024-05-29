import javax.swing.*;

public class S60_1_Ejercicio {

    public static void main(String[] args) {

        String [] apellidos = {"Hernandez", "Solveing", "Garrix", "Olivares", "Flores"};
        int contadorDeApellidos = apellidos.length;



        for(int i = 0; i < contadorDeApellidos; i++){

            if(apellidos[i].toLowerCase().contains("Garrix".toLowerCase()) ||
                            apellidos[i].equalsIgnoreCase("Solveing")){
                continue;
            }
            System.out.println(i + " - " + apellidos[i]);
        }
        System.out.println("Hay " + contadorDeApellidos + " apellidos en el arreglo");


        //Buscar un apellido
        String bucarPorApellido = JOptionPane.showInputDialog("INGRESE UN APELLIDO: ");
        System.out.println("Buscar = " + bucarPorApellido);

        boolean encontrado = false;
        for(int i = 0; i < contadorDeApellidos; i++){
            if(apellidos[i].equalsIgnoreCase((bucarPorApellido))){
                encontrado = true;
                break;
            }
            System.out.println("apellidos = " + apellidos[i]);
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, bucarPorApellido + " Fue encontrado en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, bucarPorApellido + " No existe en el arreglo");

        }


    }


}
