package exercicios2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        final int BITS_POR_BYTE = 8;
        long numBits;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de bits (valor positivo e menor que " + Long.MAX_VALUE + "): ");
        while (!scanner.hasNextLong()) {
            System.out.println("Entrada inválida. Digite um número inteiro positivo.");
            scanner.next();
        }
        numBits = scanner.nextLong();

        if (numBits <= 0 || numBits > Long.MAX_VALUE) {
            System.out.println("Número de bits inválido. Deve ser positivo e menor que " + Long.MAX_VALUE);
        } else if (numBits % BITS_POR_BYTE != 0) {
            System.out.println("O número de bits deve ser múltiplo de 8.");
        } else {
            long numBytes = numBits / BITS_POR_BYTE;
            System.out.println(numBits + " bits equivalem a " + numBytes + " bytes.");
        }

        scanner.close();
    }
}