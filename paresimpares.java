import java.util.Scanner;

public class paresimpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;

        
        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

       
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);

        scanner.close();
    }
}
