public class Ejercicio9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Mateo");
        cliente.setEdad(24);
        cliente.setTelefono("3205366483");
        cliente.setCredito(500000);

        System.out.println("CLIENTE");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito() + "\n");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("juan");
        trabajador.setEdad(28);
        trabajador.setTelefono("3112546584");
        trabajador.setSalario(1000000);

        System.out.println("TRABAJADOR");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

    }
}
