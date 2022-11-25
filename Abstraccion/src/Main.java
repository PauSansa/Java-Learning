public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRR");
        System.out.println(coche.getSonido());

    }
}

abstract class Vehiculo {
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("Constructor");
    }
    // GyS Sonido
    abstract public void setSonido(String sonido);
    abstract public String getSonido();

    //GyS matricula
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

class Coche extends Vehiculo {
    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String getSonido() {
        return null;
    }
}

class Moto extends Vehiculo{

}