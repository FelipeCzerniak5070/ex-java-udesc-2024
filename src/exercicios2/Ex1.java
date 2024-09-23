package exercicios2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        double media = (double)(num1 + num2) / 2;

        System.out.printf("A média entre %d e %d é %.2f", num1, num2, media);
    }
}