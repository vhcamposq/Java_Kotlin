fun main() {
    val nome = "Vinicius"
    val peso = 62
    val altura = 1.70
    val imc = peso / (altura * altura)


    //f-strings
    var texto = String.format("%s, seu peso é de %d kg, e sua altura é de %.2fm, portanto seu IMC é de %.1f.", nome, peso, altura, imc)
    println(texto)

    val a = "a"
    val b = "b"
    val c = 5.1

    texto = String.format("a=%s, b=%s, c=%.4f", a, b, c)
    println(texto)

}