public class S68_Clase_Wrapper_Integer {

    public static void main(String[] args) {

        int intPrimitivo = 32768;

        //Explicita
        Integer intObjeto = Integer.valueOf(32768);

        //automatica
        Integer intObjeto2 = 32768;

        int num = intPrimitivo;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "6700";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //perdida de datos
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);


        Byte byteObjetp = intObjeto.byteValue();
        System.out.println("byteObjetp = " + byteObjetp);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
        
    }


}
