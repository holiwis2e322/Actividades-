import java.util.Scanner;

public class raiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Calcular la raíz cuadrada del número
        double raizCuadrada = Math.sqrt(numero);

        // Imprimir la raíz cuadrada
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        scanner.close();
    }
}
