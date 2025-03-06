import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Digite seu sexo (1-M/2-F): ");
        int sexo = sc.nextInt();

        switch(sexo){
            case 1:
                double peso_ideal = (75.2 * altura) - 58;
                System.out.printf("Seu peso ideal é %2f kg %n", peso_ideal);
                break;
            case 2:
                double peso_idealf = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal é %2f kg %n", peso_idealf);
        }
    sc.close();
    }
}
