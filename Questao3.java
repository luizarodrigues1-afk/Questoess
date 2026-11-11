import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o valor do produto (R$): ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Informe a porcentagem de desconto (%): ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * percentualDesconto / 100.0;
        double valorComDesconto = valorProduto - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final com desconto: R$ %.2f%n", valorComDesconto);

        Scanner.close();
    }
}