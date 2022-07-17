public class Main {

    public static void main(String[] arg){
        int numeroIf = -1;
        int numeroWhile = 1;
        int numeroFor = 1;
        String estacion = "Verano";

        if (numeroIf > 0){
            System.out.println("positivo");
        } else if (numeroIf < 0){
            System.out.println("negativo");
        }

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        numeroWhile = 1;
        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (int i = 0; i <= 3;i++){
            numeroFor = numeroFor + 1;
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "Primavera":
                System.out.println(estacion);
                break;
            case "Verano":
                System.out.println(estacion);
                break;
            case "Otoño":
                System.out.println(estacion);
                break;
            case "Invierno":
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}
