class  Persona{

    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }

}




public class S75_Pasar_argumento_por_referencia_objeto_persona {


    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Edson");

        System.out.println("Iniamos el metodo main  " );
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes ed llamar el metodo test");
        test(persona);
        System.out.println("Despues ed llamar el metodo test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        
        System.out.println(" finaliza el metodo main con los datos de la persona modificados");
    }
    //int
    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test " );
        persona.modificarNombre("Luis");

        System.out.println("Finaliza el metodo test ");
    }
    


}
