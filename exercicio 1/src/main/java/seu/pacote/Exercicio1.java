import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar nome
            System.out.print("Digite o seu nome: ");
            String nome = scanner.nextLine();
            if (nome.isEmpty()) {
                System.out.println("Nome não pode ser vazio.");
                return;
            }

            // Solicitar CPF
            System.out.print("Digite o seu CPF: ");
            String cpf = scanner.nextLine();
            if (cpf.length() != 11) {
                System.out.println("CPF inválido.");
                return;
            }

            // Solicitar idade
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();
            if (idade < 0 || idade > 120) {
                System.out.println("Idade inválida.");
                return;
            }

            // Exibir os dados
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Idade: " + idade);
        }
    }
}
