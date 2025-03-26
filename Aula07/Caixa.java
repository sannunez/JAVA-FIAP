package Aula07;
/* Modificadores de acesso:
 * public  --> Sem proteção
 * protected --> 
 * private --> está encapsulado
 */

import java.util.Scanner;
import java.util.Random; // para gerar números aleatórios

public class Caixa{
    public static void main(String[] args){
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
        // Atráves do comando 1 + numero.nextInt(9999) nós sorteamos um número de 4 dígitos, gera números
        // de 0 até a 9998 (numero.nextInt(9999)) somando 1

        System.out.println("Cadastrando um novo Cliente");
        System.out.println("Digite o nome do cliente: ");
        nome = entrada.nextLine();

        System.out.println("Digite o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        Conta cliente = new Conta(nome, conta, inicial);
        cliente.iniciar();
        entrada.close();
    }
}
