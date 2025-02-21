import java.util.Scanner;

public class StringConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String input = sc.nextLine();

        int valorInt = Integer.parseInt(input);
        double valorDouble = Double.parseDouble(input);
        boolean valorBoolean = Boolean.parseBoolean(input);

        System.out.println("Conversão para int: "+valorInt);
        System.out.println("Conversão para double: "+valorDouble);
        System.out.println("Conversão para boolean: "+valorBoolean);

        sc.close();
    }
}
