public class Main {
    public static void main(String[] args) {

        //for (inicalizacion; condicion; accion sobre contador);
        //Se comprueba la condicion -> se corre el {} -> accion sobre contador
        for(int i=20; i>5; i-= 2) {
            System.out.println(i);
        }

        int Array[] = {0,1,2,3,4};

        for (int i=0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}