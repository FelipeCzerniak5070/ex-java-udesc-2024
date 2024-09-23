package exercicios1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de anos que você fuma: ");
        int anosFumando = scanner.nextInt();

        System.out.print("Digite o número de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Digite o preço de uma carteira de cigarros: R$ ");
        double precoCarteira = scanner.nextDouble();

        int diasFumando = anosFumando * 365;

        int carteiras = (cigarrosPorDia * diasFumando) / 20;

        double gastoTotal = carteiras * precoCarteira;

        System.out.println("O gasto total com cigarros em " + anosFumando + " anos é de R$ " + gastoTotal);
    }
}