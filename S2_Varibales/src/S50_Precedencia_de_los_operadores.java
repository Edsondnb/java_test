public class S50_Precedencia_de_los_operadores {

    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        
        promedio = ++i + j-- + k / 3d * 10; // (15 + 8) + 66.6
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("promedio = " + promedio);

    }

}
