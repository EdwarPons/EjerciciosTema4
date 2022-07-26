import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int numeroif = -10;
        int numeroWhile = -3;
        int numeroDoWhile = 2;
        int numeroFor = 0;
        String estacion = "PrimAveRa";

        compararNumero(numeroif);
        bucleHasta(numeroWhile);
        bucleHacerUnaVez(numeroDoWhile);
        bucleFor(numeroFor);
        enQueEstacionEstoy(estacion);
    }

    public static void compararNumero (int numeroif) {
        if (numeroif > 0) System.out.println("Valor positivo.");
        else if (numeroif < 0) System.out.println("Valor negativo.");
        else System.out.println("Cero.");
    }

    public static void bucleHasta (int numeroWhile) {
        int pararEn = 3;

        while (numeroWhile < pararEn) {
            System.out.println("BucleHasta => " + numeroWhile);
            numeroWhile++;
        }
    }

    public static void bucleHacerUnaVez (int numeroWhile) {
        int pararEn = 3;

        do {
            System.out.println("Bucle Hacer Una Vez => " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < pararEn);
    }

    public static void bucleFor (int numeroFor) {
        for (int x = numeroFor; x <= 3; x++) {
            System.out.println("Bucle For => " + x);
        }
    }

    public static void enQueEstacionEstoy (String estacion) {
        String inicioMsg = "Usted se encuentra en ";
        String estacionMsg = "";

        switch (estacion.toLowerCase()) {
            case "verano":
                estacionMsg = "Verano";
                break;
            case "primavera":
                estacionMsg = "Primavera";
                break;
            case "otoño":
                estacionMsg = "Otoño";
                break;
            case "invierno":
                estacionMsg = "Invierno";
                break;
            default:
                inicioMsg = "Lo ingresado no es una estación VALIDA!!!";
        }

        System.out.println(inicioMsg + estacionMsg);
    }
}