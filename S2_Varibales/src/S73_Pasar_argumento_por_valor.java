public class S73_Pasar_argumento_por_valor {


    public static void main(String[] args) {

        //int i = 10;
        Integer i = 10;

        System.out.println("Iniamos el metodo main con i = " + i);
        test(i);
        //No son inmutables, es decir, no cambia su valor.
        System.out.println("Finaliza el metodo main con el valor de  i (Se mantiene igual )= " + i);
    }
                            //int
    public static void test(Integer i){
        System.out.println("iniciamos el metodo test con I = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }

}
