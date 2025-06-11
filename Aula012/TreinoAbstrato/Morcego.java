package Aula012.TreinoAbstrato;

public class Morcego extends Animal{
    public Morcego(){
        this.nome = "Morcego";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("BARULHO DE MOGUERÇO!");
        
    }
    
    @Override
    public void salve() {
        super.salve();
    }

}
