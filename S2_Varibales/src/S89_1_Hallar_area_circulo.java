import java.util.Scanner;

public class S89_1_Hallar_area_circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo ");
        double radio = sc.nextDouble();

        radio = Math.pow(radio, 2);
        System.out.println("radio = " + radio);

        double area = Math.PI * radio;

        System.out.println("area = " + area);

    }


}
