import java.util.Scanner;

public class pareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite frases para serem repetidas | Digite 'PARE' para encerrar o programa!");
            String frase = sc.nextLine();

            if (frase.equalsIgnoreCase("pare")) {
                System.out.println("Programa Encerrado");
                break;
            } else {
                System.out.println("Você digitou a frase: " + frase);
                
            }
        }

        sc.close();
    }
}
