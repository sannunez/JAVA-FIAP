package Aula08;

public class Vilao extends Vingadores{
    
    public  Vilao(String nome, int idade, boolean armadura, double altura){
        super(nome, idade, armadura, altura); // executando o construtor da classe mãe
                                            // reaproveitando da classe mãe
    }
    
    // Atributos exclusivo de vilão
    public String poder;
    public int matricula;
}

