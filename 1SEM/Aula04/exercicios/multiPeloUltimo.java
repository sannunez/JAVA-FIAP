import java.util.Scanner;
// NECESSÁRIO CORRIGIR
public class multiPeloUltimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int init = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int fim =  sc.nextInt();

        System.out.println("");

        for(int a = init; a <= fim; a++){
            if(a - 1 == 0){
                System.out.println(a);
            } else {
                System.out.println(a * (a - 1));
                
            };
            
        }
        sc.close();
    }
}
