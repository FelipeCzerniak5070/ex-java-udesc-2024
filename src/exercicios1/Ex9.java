package exercicios1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println(nome + ", você foi aprovado! Sua média é: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println(nome + ", você está de exame! Sua média é: " + media);
        } else {
            System.out.println(nome + ", você foi reprovado! Sua média é: " + media);
        }
    }
}