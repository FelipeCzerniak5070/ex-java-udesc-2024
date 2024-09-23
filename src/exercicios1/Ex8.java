package exercicios1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior, menor;

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        maior = valor1;
        menor = valor1;

        for (int i = 2; i <= 4; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int valor = scanner.nextInt();

            if (valor > maior) {
                maior = valor;
            } else if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}