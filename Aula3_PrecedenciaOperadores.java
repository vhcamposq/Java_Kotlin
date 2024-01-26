public class Aula3_PrecedenciaOperadores {
    public static void main(String[] args) {
        double conta = (int) Math.pow((1 + 1) ,(5 +5));
        System.out.println(conta);

        // Medidor de IMC
        int peso = 62;
        double altura = 1.70;
        double imc = peso / (altura * altura);
        System.out.println(imc);
    }
}
