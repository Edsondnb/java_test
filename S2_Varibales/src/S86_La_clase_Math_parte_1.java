public class S86_La_clase_Math_parte_1 {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo  = " + techo );

        double piso = Math.floor(3.5);
        System.out.println("piso  = " + piso );

        long entero = Math.round(Math.PI);
        System.out.println("entero  = " + entero);

        /**************************************************************************************/
        /****************** S87. La clase Math parte 2 (trigonometría) **********************/

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
    
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.sqrt(5);
        grados = Math.round(grados);
        System.out.println("grados " + grados);
        
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        System.out.println(" seno(90): " + Math.sin(radianes));
        System.out.println(" cos(90): " + Math.cos(radianes));
        
        radianes = Math.toRadians(180.00);
        System.out.println("Math.cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Math.cos(0) = " + Math.cos(radianes));

        /**************************************************************************************/
        /****************** S88. La clase Math y el método random() para generar números aleatorios
         **********************/

        String[] coloeres = {"Azul", "Amarillo", "rojo", "Verde", "Blanco", "negro"};

        double random = Math.random();
        System.out.println("random = " + random);
        random*=coloeres.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("coloeres = " + coloeres[(int) random]);



    }


}
