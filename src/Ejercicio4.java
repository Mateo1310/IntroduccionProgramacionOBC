public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Sentencia if");

        int numeroIf = 3;

        if(numeroIf > 0){
            System.out.println("El numero "+ numeroIf +" es Positivo \n");
        }else{
            System.out.println("El numero "+ numeroIf +" es Negativo \n");
        }

        System.out.println("Bucle while");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\nBucle do while");

        int numeroWhile1 = 0;

        do {
            System.out.println(numeroWhile1);
            numeroWhile1++;
        } while (numeroWhile1 < 3);

        System.out.println("\nBucle for");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("\nSwich");

        String estacion = "Verano";

        switch (estacion) {
            case "Primavera": 
                System.out.println("Estamos en "+ estacion);               
                break;
            case "Verano": 
                System.out.println("Estamos en "+ estacion);               
                break;
            case "Otoño": 
                System.out.println("Estamos en "+ estacion);               
                break;
            case "Invierno": 
                System.out.println("Estamos en "+ estacion);               
                break;
        
            default:
                System.out.println("El valor no corresponde a una estacion del año");
                break;
        }

    }
}
