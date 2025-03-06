package Aula04;

import java.util.Scanner;

public class doisValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int inicio = sc.nextInt();
        System.out.println("Digite o valor final: ");
        int fim = sc.nextInt();
        
        System.out.println("intervalo de " + inicio + " e " + fim + " é: " );
        for(int init = inicio; init<fim+1; init++){
            System.out.printf(init + " ");
        }
        sc.close();
    }
}
