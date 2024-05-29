public class S31_Metodos_importantes_del_objeto_String_parte_1 {

    public static void main(String[] args) {

        String nombre = "Edson";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Edson\") = " + nombre.equals("Edson"));
        System.out.println("nombre.equals(\"Edson\") = " + nombre.equals("edson"));
        System.out.println("nombre.equalsIgnoreCase(\"edson\") = " + nombre.equalsIgnoreCase("edson"));
        System.out.println("nombre.compareTo(\"Edson\") = " + nombre.compareTo("Edson"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));


        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3));
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3));

        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas = " + trabalengua.replace("a","."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t"));
        System.out.println("trabalengua.startsWith(\"lenguas\") = " + trabalengua.startsWith("lenguas"));
        System.out.println("trabalengua.endsWith(\"as\") = " + trabalengua.endsWith("as"));
        System.out.println(" trabalengua  ".trim());
        
        
    }

}
