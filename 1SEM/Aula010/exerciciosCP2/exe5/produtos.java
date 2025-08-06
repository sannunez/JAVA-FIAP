package Aula010.exerciciosCP2.exe5;

public class produtos {
    String nome;
    private double precoUnitario;
    int qtdEstoque;
    int qtdVendida;

    public produtos(){}

    public produtos(String nome, double precoUnitario, int qtdEstoque){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qtdEstoque = qtdEstoque;
    }

    public void aplicarDesconto(double desconto){}

    public void calculoValorTotal(){}


    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + precoUnitario);
        System.out.println("Estoque(qtd): " + (qtdEstoque - qtdVendida));
        System.out.println("Quantidade vendida: " + qtdVendida);
    }
}
