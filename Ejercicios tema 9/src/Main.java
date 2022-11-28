public class Main {
    public static void main(String[] args) {
        Cliente Jaime = new Cliente(22, "Jaime", 674809729, 8943);
        Trabajador Pepe = new Trabajador(22,"Pepe", 699999999, 1800 );
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;


}

class Cliente extends Persona {
    int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;

        System.out.println(nombre + " tiene " + edad + " años, su telefono es: " + telefono +
                " y tiene un credito de:" + credito);

    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;

        System.out.println(this.nombre + " tiene " + this.edad + " años, su telefono es:" + this.telefono
        + " y cobra " + this.salario + " al mes");
    }
}