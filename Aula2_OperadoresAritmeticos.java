public class Aula2_OperadoresAritmeticos {
    public static void main(String[] args) {
        int adicao = 10 + 10;
        System.out.println("Resultado " + adicao);

        int subtracao = 10 - 5;
        System.out.println("Resultado " + subtracao);

        int mult = 10 * 10;
        System.out.println("Resultado " + mult);

        float divisao = 10 / 2.2f;
        System.out.println("Resultado " + divisao);

        float divisao_inteira = (int) (10 / 2.2f);
        System.out.println("Resultado " + divisao_inteira);

        int exponeciacao = (int)Math.pow(2, 10);
        System.out.println("Resultado " + exponeciacao);

        int modulo = 55 % 2;
        System.out.println("Resultado " + modulo);

        //Concatenar
        String concatenar = "A" + "B" + "C";
        System.out.println("Resultado " + concatenar);

        String a_10_vezes = "A".repeat(10);
        System.out.println("Resultado " + a_10_vezes);

        String tres_vezes_ana = "Ana".repeat(3);
        System.out.println("Resultado " + tres_vezes_ana);

    }
}
