package Aula010.exerciciosCP2.exe5;

public class testeProdutos {
    public static void main(String[] args) {
        produtos eletronicos = new eletronicos("Iphono 89", 12000, 7, 2);
        eletronicos.calculoValorTotal();
        eletronicos.aplicarDesconto(0.9);


        produtos roupas = new roupas("Carçola de pedrero", 12, 9, 2);
        roupas.calculoValorTotal();
        roupas.aplicarDesconto(0.8);

        produtos alimentos = new alimentos("Banana ( ͡° ͜ʖ ͡°)", 8, 12, 12);
        alimentos.calculoValorTotal();

        eletronicos.exibirInformacoes();
        System.out.println();
        roupas.exibirInformacoes();
        System.out.println();
        alimentos.exibirInformacoes();



    }
}
