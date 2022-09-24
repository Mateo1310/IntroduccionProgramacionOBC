public class Ejercicio8{
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Mateo");
        System.out.println("Nombre: "+persona.getNombre());

        persona.setEdad(24);
        System.out.println("Edad: "+ persona.getEdad());

        persona.setTelefono("3205366483");
        System.out.println("Telefono: "+ persona.getTelefono());
    }

}
