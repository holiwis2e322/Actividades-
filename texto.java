import java.util.Scanner;

public class texto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();
        scanner.close();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int longitud = cadenaLimpia.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
