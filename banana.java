import java.util.Scanner;

public class banana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena de texto
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        // Solicitar al usuario el carácter que desea reemplazar
        System.out.print("Ingresa el carácter que deseas reemplazar: ");
        char caracterAReemplazar = scanner.next().charAt(0);

        // Solicitar al usuario el nuevo carácter
        System.out.print("Ingresa el nuevo carácter: ");
        char nuevoCaracter = scanner.next().charAt(0);

        // Reemplazar el carácter en la cadena
        String cadenaReemplazada = cadena.replace(caracterAReemplazar, nuevoCaracter);

        // Imprimir la cadena resultante
        System.out.println("La nueva cadena es: " + cadenaReemplazada);

        scanner.close();
    }
}
