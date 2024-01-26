fun main() {
    val adicao = 10 + 10
    println("Resultado $adicao")

    val subtracao = 10 - 5
    println("Resultado $subtracao")

    val mult = 10 * 10
    println("Resultado $mult")

    val divisao = 10 / 2.2f
    println("Resultado $divisao")

    val divisao_inteira = (10 / 2.2f).toInt().toFloat()
    println("Resultado $divisao_inteira")

    val exponeciacao = Math.pow(2.0, 10.0).toInt()
    println("Resultado $exponeciacao")

    val modulo = 55 % 2
    println("Resultado $modulo")


    //Concatenar
    val concatenar = "A" + "B" + "C"
    println("Resultado $concatenar")

    val a_10_vezes = "A".repeat(10)
    println("Resultado $a_10_vezes")

    val tres_vezes_ana = "Ana".repeat(3)
    println("Resultado $tres_vezes_ana")
}