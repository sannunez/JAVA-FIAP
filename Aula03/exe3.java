import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nº de lados do polígono: ");
        int lados = sc.nextInt();
        
        if (lados<3){
            System.out.println("é uma linha");
        } else if (lados>4) {
            System.out.println("não é um poligono válido");
        } else {
            switch (lados){
                case 3:
                    System.out.println("Triângulo");
                    System.out.println("Digite o valor da base: ");
                    double base = sc.nextDouble();
    
                    System.out.println("Digite o valor da altura: ");
                    double altura = sc.nextDouble();
    
                    double area = (base * altura)/2;
                    System.out.println("Area: "+area);
                    break;
                case 4:
                    System.out.println("Quadrado");
                    System.out.println("Digite o valor da base: ");
                    double basee = sc.nextDouble();
    
                    System.out.println("Digite o valor da altura: ");
                    double alturaa = sc.nextDouble();
    
                    double areaa = (basee * alturaa);
                    System.out.println("Area: "+areaa);
                    break;
                }

        }
        sc.close();
    }
}
