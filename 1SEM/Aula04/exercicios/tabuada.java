import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        // MEU MÉTODO
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Digite a tabuada desejada: ");
        // int tabuada = sc.nextInt();

        // for(int a = 0; a<=10; a++){
        //     System.out.println(a + " x " + tabuada + " = " + (a * tabuada));
        // }

        // MÉTODO DO PROFESSOR
        Scanner sc = new Scanner(System.in);
        int numero;
        char continuar;

        do{
            System.out.println("Digite um numero de 0 a 10: ");
            numero = sc.nextInt();

            if (numero < 0 || numero > 10){
                System.out.println("Digite um número válido");
            } else {
                System.out.println("Tabuada do numero " + numero + ":") ;
                for(int i = 0; i <= 10; i++){
                    System.out.println(numero + "X" + i + "=" + (numero * i));
                }
            }

            System.out.println("Deseja Continuar? (s/n)");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        sc.close();
    }
}
