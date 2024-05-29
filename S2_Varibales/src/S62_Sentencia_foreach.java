public class S62_Sentencia_foreach {

    public static void main(String[] args) {
        //***------------  solo para arreglos o para cada elemento del arreglo ---------********

        int[] numeros = {1,3,5,7,9,11,13,15};

        for (int num: numeros){
            System.out.println(num);
        }

        int[] numerosPares = {2, 4, 6, 10, 20};
        for (int numP : numerosPares){
            System.out.println(numP);
        }

        String [] nombres = {"Edson", "Monica", "Pepe", "Luis", "Patricia", "Javier"};
        for (String nom:nombres) {
            System.out.println("nom = " + nom);
        }

    }
}
