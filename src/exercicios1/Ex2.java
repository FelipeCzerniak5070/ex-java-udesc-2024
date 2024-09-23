package exercicios1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("O consumo médio do veículo é de %.2f km/l", consumoMedio);
    }
}