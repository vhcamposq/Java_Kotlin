import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Digite seu nome: ")
    val nome = scanner.nextLine()
    println(String.format("Olá, %s", nome))

    println("Digite o primeiro numero: ")
    val n1 = scanner.nextInt()
    println("Digite o segundo numero: ")
    val n2 = scanner.nextInt()
    val soma = n1 + n2

    println(String.format("A soma dos dois numeros é: %d.", soma))


}