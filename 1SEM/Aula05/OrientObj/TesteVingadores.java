public class TesteVingadores {
    public static void main(String[] args) {
        
        // Criação dos objetos (Vingadores)
        //Instanciação dos objetos

        // new -> Palavra reservada do Java para instanciar objetos
        Vingadores HomemDeFerro = new Vingadores();
        HomemDeFerro.nome = "Tony Stark";
        HomemDeFerro.idade = 50;
        HomemDeFerro.armadura = "Mark II";
        HomemDeFerro.peso = 150;
        HomemDeFerro.altura = 1.80; 

        Vingadores Hulk = new Vingadores();
        Hulk.armadura = "Shorts Roxo";
        Hulk.nome = "Bruce Banner";
        

        // System.out.println(HomemDeFerro);
        System.out.println("Nome do vingador: " + HomemDeFerro.nome);
        System.out.println("Idade: " + HomemDeFerro.idade);
        HomemDeFerro.lutar();


        System.out.println("\nArmadura do Vingador: " + Hulk.armadura);
        System.out.println("É a identidade secreta do: " + Hulk.nome);
        Hulk.lutar(); 

    }   
}
