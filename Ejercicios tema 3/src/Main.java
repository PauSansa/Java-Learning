public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(2,5,1);
        System.out.println("El resultado es " + resultado);
        Coche miCoche = new Coche();
        miCoche.sumaPuerta();
        System.out.println("Tu Coche tiene " + miCoche.puertas + " puerta");
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    }
}
class Coche {
    public int puertas = 0;

    public void sumaPuerta() {
        this.puertas ++;
    }
}
