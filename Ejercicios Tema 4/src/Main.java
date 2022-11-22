public class Main {
    public static void main(String[] args) {

        int numeroIf = -5;
        int numerowhile =-3;
        int numeroDoWhile = 1;
        String estacion = "verano";

        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }

        while (numerowhile < 3) {
            numerowhile++;
            System.out.println(numerowhile);
        }

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile > 2);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case ("verano"):
                System.out.println("Estas en Verano");
                break;
            case ("invierno"):
                System.out.println("Estas en Invierno");
                break;
            case ("primavera"):
                System.out.println("Estas en Primavera");
                break;
            case ("otono"):
                System.out.println("Estas en Otoño");
                break;
            default: System.out.println("No has seleccionado ninguna estacion");
                break;
        }

    }
}