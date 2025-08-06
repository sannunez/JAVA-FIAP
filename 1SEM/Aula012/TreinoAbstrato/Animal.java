package Aula012.TreinoAbstrato;

public abstract class Animal {
    protected String nome;
    protected int numeroPatas;

    public abstract void som();

    public void salve(){
        System.out.println("Salve, sou um " + nome);
    }
}
