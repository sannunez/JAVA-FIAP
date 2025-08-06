package Aula07;
import java.util.Scanner;

// Usando o encapsulamento
public class Conta {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public Conta(String nome, int conta, double saldo_inicial){
        this.nome = nome;
        this.conta = conta;
        saldo = saldo_inicial;
        saques = 0;
    }

    // É similar a função GET, pois "estamos pegando dados"
    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo Atual: %.2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
    }

    // É similar a função SET, pois "estamos alterando dados"
    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Valor Sacado: " + valor);
            System.out.println("Saldo Atualizado: " + saldo + "\n");
        }
        else {
            System.out.println("Atenção!!! Saldo da conta insuficiente. Faça  um depósito\n");
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo Saldo: " + saldo + "\n");
    }

    public void iniciar(){
        int opc;

        do{
            exibeMenu();
            opc = entrada.nextInt();
            escolheOpcao(opc);
        } while (opc != 4);
    }

    public void exibeMenu(){
    System.out.println("\t Escolha a opção desejada: ");
    System.out.println("1 - Consultar Extrato");
    System.out.println("2 - Sacar");
    System.out.println("3 - Depositar");
    System.out.println("4 - SAIR");
}

    public void escolheOpcao(int opc){
        double valor;

        switch (opc) {
            case 1:
                extrato();
                break;

            case 2:
                if(saques<3){
                    System.out.println("Quanto deseja sacar?: ");
                    valor = entrada.nextDouble();
                    sacar(valor);
                } else {
                    System.out.println("Limite de saques diários excedido");
                }
                break;

            case 3:
                System.out.println("Quanto deseja depositar?: ");
                valor = entrada.nextDouble();
                depositar(valor);
                break;
            
            case 4:
                System.out.println("Sistema encerrado");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

