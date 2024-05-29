import java.util.Scanner;

public class S24_DetalleDeFactura {


    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el primer precio");
        Double precio1 = sc.nextDouble();

        System.out.println("Ingrese el Segundo precio");
        Double precio2 = sc.nextDouble();

        Double totalBruto = precio1 + precio2;
        Double totalImpuesto = totalBruto * 0.19;
        Double totalNeto = totalBruto + totalImpuesto;

        System.out.println("La Factura " + nombre + " tiene un total bruto " + totalBruto + " , con impuesto " +
                "de " + totalImpuesto + " con un total neto de " + totalNeto);*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingre el nombre del clinte: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la cantida del 1er producto: ");
        Integer cantida1 = sc.nextInt();

        System.out.println("Ingrese la cantidad del 2do producto: ");
        Integer cantidad2 = sc.nextInt();

        System.out.println("Ingrese el primer monto: ");
        Double precio1 = sc.nextDouble();

        System.out.println("Ingrese el segundo monto: ");
        Double precio2 = sc.nextDouble();

        double total1 = cantida1 * precio1;
        double total2 = cantidad2 * precio2;

        System.out.println("primer total: " + total1);
        System.out.println("segundo total: " + total2);

        double descuento1 = 0;
        double descuento2 = 0;

        if (total1 > 500) {
             descuento1 = total1 * 0.15;
        }

        if (total2 > 100) {
            descuento2 = total2 * 0.05;
        }

        System.out.println("Descuento 1: " + descuento1);
        System.out.println("Descuento 2: " + descuento2);

        double promedioFinal = (total1 - descuento1) + (total2 - descuento2);
        double impuesto = promedioFinal * 0.18;
        double totalFinal = promedioFinal + impuesto;

        System.out.println("El promedio Final es: " + promedioFinal);
        System.out.println("El impuesto es: " + impuesto);
        System.out.println("El total Final es: " + totalFinal);


    }
}
