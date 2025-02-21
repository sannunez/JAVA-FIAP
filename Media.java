import java.util.Scanner;

public class Media {
    public static void main(StringConversor[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Digite o 1* numero");
        n1 = sc.nextFloat();
        System.out.println("Digite o 2* numero");
        n2 = sc.nextFloat();
        System.out.println("Digite o 3* numero");
        n3 = sc.nextFloat();
    
        float media = (n1 + n2 + n3)/3;

        System.out.printf("A média é: %.2f", media);
        sc.close();
    }
}
