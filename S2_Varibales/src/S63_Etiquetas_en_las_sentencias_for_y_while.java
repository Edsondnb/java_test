public class S63_Etiquetas_en_las_sentencias_for_y_while {

    public static void main(String[] args) {

        bucle1:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while ( j <= 8) {
                if( i == 6 || i == 7){
                    System.out.println("Dia " + i + " Descansando de fin de semana");
                    continue bucle1;
                }
                System.out.println("Dia  " + i +  ", trabando a las  " + j + "hrs.");
                j++;
            }
        }
        System.out.println("\n============================================================");

        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if( i == 2){
                    break etiqueta;
                }
                System.out.print("[i = " + i +  ", j = " + j + "],");
            }
        }

        aulas:
        for(int a = 1; a <= 5; a++){
            if(a == 2 || a == 4){
                System.out.println("Aula ocupado por reserva: " + a);

            }else{
                System.out.println("Aula sin reserva: " + a);
            }
        }




    }


}
