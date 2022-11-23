
public class Main {
    public static void main(String[] args) {
        //Creas objeto con parametros int Peso, String Modalidad i int cantidad

        Ticket Prueba =new Ticket(12, "Normal", 1);
        Ticket Prueba2 =new Ticket(7, "Business",  3);
        //Prueba.crearFrase();
        Prueba2.crearFrase();

    }
}

class Ticket {
    double peso;
    String modalidad;
    int cantidad;


    public Ticket(double pPeso, String pModalidad, int pCantidad) {
        peso = pPeso;
        modalidad = pModalidad;
        cantidad = pCantidad;

    }
    //Equipaje
    public int calcularTarifa(){
        if (peso > 10) {
            return 2;
        } else {
            return 1;
        }
    }

    public double calcularPrecioEnvio() {
        if (calcularTarifa() == 1) {
            return peso * 1;
        } else {
            return peso * 1.5;
        }
    }

    //Modalidad

    public double calcularPrecioModalidad() {
        if (modalidad == "Normal") {
            return 10.50;
        } else {
            return 25.90;
        }
    }

    //Calcular Precio Total

    public double calcularPrecioTotal(){
        return (calcularPrecioModalidad() + calcularPrecioEnvio()) * cantidad;
    }

    //Crear Frase

    public void crearFrase() {
        System.out.println("Precio Envio: " + calcularPrecioEnvio());
        System.out.println("Precio Modalidad: " + calcularPrecioModalidad());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("El precio total de su billete es: " + calcularPrecioTotal() );
    }
}