import java.util.Scanner;

public class Aula6_condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        }else {
            System.out.println("Você é menor de idade.");
        }

        if (idade <= 10){
            System.out.println("Você é criança");
        } else if (idade > 10 && idade <= 17) {
            System.out.println("Você é adolescente");
        } else if (idade >= 18 && idade <=59) {
            System.out.println("Voce é adulto");
        }else {
            System.out.println("Você é idoso. ");
        }

        System.out.println("Você quer continuar? (y/n): ");
        String escolha = scanner.nextLine();

        if (escolha.equals("y")){
            System.out.println("Você escolheu continuar.");
        } else if (escolha.equals("n")) {
            System.out.println("Você escolheu parar.");
        }else {
            System.out.println("Escolha não identificada.");
        }
        System.out.println("Digite o numero 10: ");
        int comparar = scanner.nextInt();
        int numero = 10;

        if (comparar == numero){
            System.out.println("Digitou corretamente!");
        }else {
            System.out.println("Burro!");
        }

    }
}
