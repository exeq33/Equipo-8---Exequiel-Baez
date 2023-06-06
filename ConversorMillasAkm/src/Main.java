import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double distMillas, distKm;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Indica una distancia en millas");
        distMillas = entrada.nextDouble();

        distKm = distMillas*1.60934;

        System.out.println("La distancia en kilometros es: "+distKm);



    }
}