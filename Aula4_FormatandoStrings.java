public class Aula4_FormatandoStrings {
    public static void main(String[] args) {
        String nome = "Vinicius";
        int peso = 62;
        double altura = 1.70;
        double imc = peso / (altura * altura);

        //f-strings
        String texto = String.format("%s, seu peso é de %d kg, e sua altura é de %.2fm, portanto seu IMC é de %.1f.", nome, peso, altura, imc);
        System.out.println(texto);

        String a = "a";
        String b = "b";
        double c = 5.1;

        texto = String.format("a=%s, b=%s, c=%.4f", a, b, c);
        System.out.println(texto);

    }
}
