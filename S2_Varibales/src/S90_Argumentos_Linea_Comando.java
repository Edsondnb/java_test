public class S90_Argumentos_Linea_Comando {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Bebe ingresar argumentos");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos n = " + i + " :" + args[i]);
        }

    }
}
