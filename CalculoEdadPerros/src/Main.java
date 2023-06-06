import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int edadPersona, edadCanina;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es la edad de tu perro?");
        edadPersona = entrada.nextInt();

        edadCanina = edadPersona*7;

        System.out.println("Tu perro tiene "+edadCanina +" años humanos");


    }
}