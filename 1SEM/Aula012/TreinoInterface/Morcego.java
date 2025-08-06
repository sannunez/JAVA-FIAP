package Aula012.TreinoInterface;

public class Morcego implements Animal{
    String poder;

    public Morcego(String poder){
        this.poder = poder;
    }

    public void nasce() {
        System.out.println("Nasce um lindo morcego. . .");        
    }

    public void movimenta() {
        System.out.println("O morcego voa de lá pra cá. . .");
        
    }

    public void dorme() {
        System.out.println("O morcego dorme de cabeça para baixo!");
        
    }
}
