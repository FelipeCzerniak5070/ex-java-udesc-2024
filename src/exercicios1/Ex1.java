package exercicios1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();


        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("O sucessor de " + numero + " é " + sucessor);
        System.out.println("O antecessor de " + numero + " é " + antecessor);
    }
}