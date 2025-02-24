public class variaveis{
    public static void main(String[] args) {
        // declarando variavies
        int idade = 10;
        double preco = 10.0;
        char sexo = 'M';
        boolean maiorIdade = false;

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(sexo);
        System.out.println(maiorIdade);

        // conversão por casting (+ perda de informação)
        double x = 10.0;
        int y = (int) x;
        System.out.println(y);

    }
}