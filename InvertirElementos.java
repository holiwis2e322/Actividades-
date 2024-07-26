import java.util.Scanner;

public class InvertirElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        
        System.out.println("Ingresa 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        int[] numerosInvertidos = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
        }

        
        System.out.println("El array invertido es:");
        for (int numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }
        System.out.println();

        scanner.close();
    }
}
