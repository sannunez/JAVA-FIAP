package Aula010.exerciciosCP2.exe3;

public class testaProduto {
    public static void main(String[] args) {
        produto eletronico = new eletronico("Iphone 5", 1000);
        eletronico.aplicaDesconto();

        produto roupa = new roupa("Saia", 50);
        roupa.aplicaDesconto();

        produto livro = new livro("Harry Potter", 10);
        livro.aplicaDesconto();

        eletronico.exibirInformacoes();
        System.out.println();
        roupa.exibirInformacoes();
        System.out.println();
        livro.exibirInformacoes();
    }
    
}
