package Aula010.exerciciosCP2.exe5;

public class alimentos extends produtos{
    double quilosComprados;
    double valorTotal;
    
    public alimentos (String nome, double precoUnitario, int qtdEstoque, double quilosComprados){
        super(nome, precoUnitario, qtdEstoque);
        this.quilosComprados = quilosComprados;
        valorTotal = precoUnitario * quilosComprados;
    }

    @Override
    public void calculoValorTotal() {
        valorTotal = getPrecoUnitario() * quilosComprados;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço(KG): " + getPrecoUnitario());
        System.out.println("Estoque(qtd): " + qtdEstoque);
        System.out.println("Quantidade vendida: " + quilosComprados);
        System.out.println("Valor total: " + valorTotal);
    }
}
