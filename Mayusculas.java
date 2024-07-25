import java.util.Scanner;

public class Mayusculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Ingresa una palabra o cadena de texto (deja en blanco para terminar): ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            System.out.println(convertirAMayusculas(input));
        }

        scanner.close();
        System.out.println("Programa terminado.");
    }

    public static String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }
}
