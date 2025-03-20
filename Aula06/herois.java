public class herois {
    String nomeDeHeroi;
    String nome;
    int idade;
    double peso;
    boolean poderes;

    void salvar(){
       System.out.println("O herói " + this.nomeDeHeroi + " está salvando a cidade!");
    }

    void lutar(){
        System.out.println("O herói " + this.nomeDeHeroi + " está salvando a cidade!");
    }

    void exibirAtributos(){
        System.out.println("Nome: "+ this.nomeDeHeroi);
        System.out.println("Identidade secreta:"+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Peso: "+ this.peso);
        System.out.println("Tem poder: "+ this.poderes);
    }
}
