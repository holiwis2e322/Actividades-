import java.util.Scanner;

public class cinconumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        
        System.out.println("Ingresa 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        for (int numero : numeros) {
            suma += numero;
        }

        
        System.out.println("La suma de todos los elementos es: " + suma);

        scanner.close();
    }
}
