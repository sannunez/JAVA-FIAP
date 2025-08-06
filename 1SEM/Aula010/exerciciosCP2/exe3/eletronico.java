package Aula010.exerciciosCP2.exe3;

public class eletronico extends produto{
    private double precoDesconto;

    public eletronico(String nome, double precoBase){
       super(nome, precoBase);

    }

    @Override
    public void aplicaDesconto() {
        precoDesconto = getPrecoBase() * 0.9;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo de produto: Eletrônico");
        super.exibirInformacoes();
        System.out.println("Preço Final(C/Desconto): " + precoDesconto);
    }
}
