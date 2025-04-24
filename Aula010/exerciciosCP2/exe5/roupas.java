package Aula010.exerciciosCP2.exe5;

public class roupas extends produtos{
    int qtdVendida;
    double valorTotal;
    
    public roupas(String nome, double precoUnitario, int qtdEstoque, int qtdVendida){
        super(nome, precoUnitario, qtdEstoque);
        this.qtdVendida = qtdVendida;
        
    }

    public void aplicarDesconto(double desconto){
        valorTotal = valorTotal * desconto;
    }

    @Override
    public void calculoValorTotal() {
        valorTotal = getPrecoUnitario() * qtdVendida;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Valor total: " + valorTotal);
    }
}
