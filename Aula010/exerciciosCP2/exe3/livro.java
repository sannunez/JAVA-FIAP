package Aula010.exerciciosCP2.exe3;

public class livro extends produto{
    private double precoDesconto;

    public livro(String nome, double precoBase){
       super(nome, precoBase);

    }

    @Override
    public void aplicaDesconto() {
        precoDesconto = getPrecoBase() * 0.95;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo de produto: Livro");
        super.exibirInformacoes();
        System.out.println("Preço Final(C/Desconto): " + precoDesconto);
    }
}
