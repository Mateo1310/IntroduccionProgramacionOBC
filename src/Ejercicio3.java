public class Ejercicio3 {
    public static void main(String[] args) {

        sumaTresEnteros(2, 5, 3);

        coche miCoche = new coche();
        miCoche.añadirPuertaCoche();
        miCoche.mostrarNumeroPuertas();
        
    }

    public static void sumaTresEnteros(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        System.out.println("La suma de los tres valores enteros es:  " + resultado);
    }
    
}

class coche{
    public int numeroPuertas = 2;

    public void añadirPuertaCoche(){
        this.numeroPuertas++;
    }

    public void mostrarNumeroPuertas(){
        System.out.println("El numero de puertas es: " + numeroPuertas);
    }

}