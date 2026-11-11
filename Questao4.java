import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("Média final = %.2f%n", media);

        Scanner.close();
    }
}