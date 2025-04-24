package Aula010.exerciciosCP2.exe3;

public class roupa extends produto{
    private double precoDesconto;

    public roupa(String nome, double precoBase){
       super(nome, precoBase);

    }

    @Override
    public void aplicaDesconto() {
        precoDesconto = getPrecoBase() * 0.8;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo de produto: Roupa");
        super.exibirInformacoes();
        System.out.println("Preço Final(C/Desconto): " + precoDesconto);
    }
}
