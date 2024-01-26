import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Qual é a sua idade: ")
    val idade = scanner.nextInt()

    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é menor de idade.")
    }

    if (idade <= 10) {
        println("Você é criança")
    } else if (idade > 10 && idade <= 17) {
        println("Você é adolescente")
    } else if (idade >= 18 && idade <= 59) {
        println("Voce é adulto")
    } else {
        println("Você é idoso. ")
    }

    println("Você quer continuar? (y/n): ")
    val escolha = scanner.nextLine()

    if (escolha == "y") {
        println("Você escolheu continuar.")
    } else if (escolha == "n") {
        println("Você escolheu parar.")
    } else {
        println("Escolha não identificada.")
    }
    println("Digite o numero 10: ")
    val comparar = scanner.nextInt()
    val numero = 10

    if (comparar == numero) {
        println("Digitou corretamente!")
    } else {
        println("Burro!")
    }
}