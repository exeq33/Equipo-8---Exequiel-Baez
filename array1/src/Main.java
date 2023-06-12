import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese 5 Numeros");

        int[] numeros = new int[5];
        int mayor = 0;
        int menor = 0;
        float sumatoria = 0, promedio = 0;

        Scanner entrada = new Scanner(System.in);

        for(int i=0;i<numeros.length;i++){

            System.out.println("Ingrese el numero de la posicion " +i);
            numeros[i] = entrada.nextInt();
            if(numeros[i] >= mayor || i == 0)  mayor = numeros[i];
            if(numeros[i] <= menor || i == 0)  menor = numeros[i];
            sumatoria = sumatoria +numeros[i];
            promedio = sumatoria / numeros.length;
        }

        System.out.println("Los numeros en el array son: ");

        for (int num:numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nEl mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
        System.out.println("La sumatoria es: "+sumatoria);
        System.out.println("El promedio es: "+promedio);









    }
}