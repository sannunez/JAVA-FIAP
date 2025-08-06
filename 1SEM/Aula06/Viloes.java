public class Viloes {
    String nomeDeVilao;
    int idade;
    double peso;
    boolean poderes;

    public void roubar(){
        System.out.println("O vilão " + this.nomeDeVilao + " está roubando o banco!");
    }

    public void disfarce(String nomeDeHeroi){
        System.out.println( this.nomeDeVilao + "esta disfarçado de " + nomeDeHeroi);
    }

    public void fugir(){
        System.out.println(this.nomeDeVilao + " está fugindo!");
    }

    void atributos(){
        System.out.println("Identidade secreta:"+ this.nomeDeVilao);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Peso: "+ this.peso);
        System.out.println("Tem poder: "+ this.poderes);
    }
}
