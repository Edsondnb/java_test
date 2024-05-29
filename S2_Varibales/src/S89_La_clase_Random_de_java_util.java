import java.util.Random;

public class S89_La_clase_Random_de_java_util {


    public static void main(String[] args) {

        Random randomObj = new Random();    //invcluiye el 7
        int randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);


        String[] coloeres = {"Azul", "Amarillo", "rojo", "Verde", "Blanco", "negro"};
        randomInt = randomObj.nextInt(coloeres.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("coloeres = " + coloeres[randomInt]);
    }
}
