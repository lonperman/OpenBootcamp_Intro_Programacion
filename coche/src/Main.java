public class Main {

    public static void main(String[] arg){
        Coche miCoche = new Coche();
        miCoche.increment();
        System.out.println(miCoche.numeroDePuertas);

    }

    static class Coche {
        int numeroDePuertas;
        int velocidadMaxima;
        float velocidadActual;

        public Coche(){
            numeroDePuertas = 5;
            velocidadActual = 120;
        }

        public Coche(int numeroDePuertas, int velocidadMaxima){
            this.numeroDePuertas = numeroDePuertas;
            this.velocidadActual = velocidadMaxima;
        }
        public void increment(){
            numeroDePuertas += 1;
        }
    }
}
