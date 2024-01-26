import java.util.Scanner;

public class Aula5_entradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println(String.format("Olá, %s", nome));

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        int soma = n1 + n2;

        System.out.println(String.format("A soma dos dois numeros é: %d.", soma));


    }
}
