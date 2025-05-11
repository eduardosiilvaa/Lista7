import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o valor do produto: ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                System.out.println("Valor inválido.");
                return;
            }

            double novoValor = calcularAumento(valor);
            System.out.printf("Novo valor do produto: %.2f%n", novoValor);
        }
    }

    public static double calcularAumento(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor inválido");
        return valor * 1.10;
    }
}
