import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precioOriginal, precioFinal;
        int descuento;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indica el precio:");
        precioOriginal = entrada.nextDouble();

        System.out.println("Indica el porcentaje de descuento:");
        descuento = entrada.nextInt();

        precioFinal = precioOriginal - (precioOriginal * descuento/100);

        System.out.println("El precio final es: "+precioFinal);






    }
}