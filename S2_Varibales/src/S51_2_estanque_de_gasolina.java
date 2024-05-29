import java.util.Scanner;

public class S51_2_estanque_de_gasolina {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese la medida ");
        double ingresarMedida = sc.nextDouble();

        if(ingresarMedida == 70){
            System.out.println("Estanque lleno = " + ingresarMedida);
        } else if (ingresarMedida >= 60) {
            System.out.println("Estanque casi lleno = " + ingresarMedida);
        } else if (ingresarMedida >= 40 ) {
            System.out.println("Estanque  3/4 = " + ingresarMedida);
        } else if (ingresarMedida >= 35) {
            System.out.println("Medio Estanque  = " + ingresarMedida);
        } else if (ingresarMedida >= 20) {
            System.out.println("Suficiente = " + ingresarMedida);
        }else {
            System.out.println("Insuficiente = " + ingresarMedida);
        }


    }




}
