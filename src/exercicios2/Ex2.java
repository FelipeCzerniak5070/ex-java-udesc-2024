import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");

        if (num1Str == null || num2Str == null || num1Str.isEmpty() || num2Str.isEmpty()) {
            System.exit(0);
        }

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double media = (num1 + num2) / 2;

        String resultado = String.format("A média entre %.2f e %.2f é %.2f", num1, num2, media);
        JOptionPane.showMessageDialog(null, resultado);
    }
}