package exercicios1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite M para masculino ou F para feminino: ");
        String sexo = scanner.next();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Sexo: Masculino");
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}