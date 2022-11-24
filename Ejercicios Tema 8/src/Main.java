
public class Main {
    public static void main(String[] args) {

        Persona Pepe =new Persona();
        Pepe.setEdad(18);
        Pepe.setNombre("Pepe");
        Pepe.setTelefono(648390298);
        System.out.println(Pepe.getNombre() + " tiene " + Pepe.getEdad() + " años y su telefono es: "+ Pepe.getTelefono());
    }
}

