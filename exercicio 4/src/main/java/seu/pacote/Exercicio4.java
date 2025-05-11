import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = converterParaCelsius(fahrenheit);
            System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);
        }
    }

    public static double converterParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
