package main.java.seu_pacote;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double media = calcularMedia(num1, num2);
            System.out.println("Média: " + media);
        }
    }

    public static double calcularMedia(double a, double b) {
        return (a + b) / 2;
    }
}
