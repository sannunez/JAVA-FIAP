import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        int v1 = sc.nextInt();

        System.out.println("Digite o 2º número");
        int v2 = sc.nextInt();

        System.out.println("Digite o 3º número");
        int v3 = sc.nextInt();

        int menor, medio, maior;
        
        if (v1>v2 && v1>v3){
            maior = v1;

            if (v2>v3) {
                medio = v2;
                menor = v3;
            } else {
                medio = v3;
                menor = v2;
            }
        } 
        else if (v2>v1 && v2>v3){
            maior = v2;

            if (v2>v1) {
                medio = v2;
                menor = v1;
            } else {
                medio = v1;
                menor = v2;
            }
        } 
        else{
            maior = v3;

            if (v2>v1) {
                medio = v2;
                menor = v1;
            } else {
                medio = v1;
                menor = v2;
            }
        }
        
        sc.close();
        System.out.println("Ordem Crescente: " + menor + " " + medio + " " +maior);
    }
}
