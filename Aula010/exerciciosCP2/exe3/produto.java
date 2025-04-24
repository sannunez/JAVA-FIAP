package Aula010.exerciciosCP2.exe3;

public class produto {
    private String nome;
    private double precoBase;

    public produto(){}

    public produto(String nome, double precoBase){
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public void aplicaDesconto(){}

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + precoBase);
    }

}
