public class Main {
    public static void main(String[] args) {
        int contador = 10;
        int contadordw = 0;
        // While, primero se comprueba la condición y luego se corre la acción
        while (contador > 0) {
            System.out.println("El contador vale: " + contador);
            contador -= 1;
        }
        //Do While, primero se corre la acción, luego se comprueba la condición
        do {
            contadordw -= 1;
            System.out.println(contadordw);
        } while(contadordw > 0);

    }
}