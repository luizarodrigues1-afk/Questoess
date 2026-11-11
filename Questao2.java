import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        final double PRECO_POR_LITRO = 6.69;

        System.out.print("Informe o valor total do abastecimento (R$): ");
        double valorTotal = scanner.nextDouble();

        double litrosAbastecidos = valorTotal / PRECO_POR_LITRO;

        System.out.printf("Litros abastecidos: %.4f L%n", litrosAbastecidos);

        Scanner.close();
    }
}