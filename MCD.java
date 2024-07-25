import java.util.Scanner;

public class MCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
