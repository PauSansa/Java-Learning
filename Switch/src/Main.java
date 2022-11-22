public class Main {
    public static void main(String[] args) {

        var estacion = "VERANO";
        //el Switch correra el case que concuerde,
        //si no hay ninguno que concuerde se ejecuta el default, si no pones break se corre todo

        switch (estacion) {
            case ("VERANO"):
                System.out.println("Es Verano");
                break;
            case ("INVIERNO"):
                System.out.println("Es Invierno");
                break;
            default: System.out.println("Es Default");
        }
    }
}