import java.util.Scanner;
import java.util.ArrayList;

public class cadastroMarvel{
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Cadastro de Heróis e Vilões");
        boolean funcionamento = true;

        while(funcionamento){
            System.out.println("O que deseja cadastrar (1: Herói / 2: Vilão / 3: Encerrar) ?");
            Scanner sc = new Scanner(System.in);
            ArrayList<herois> listaDeHerois = new ArrayList<>(); 

            switch (sc.nextInt()) {
                case 1:
                    herois heroi = new herois();

                    // NOME DE HEROI
                    System.out.println("Nome de herói: ");
                    heroi.nomeDeHeroi = sc.nextLine();

                    System.out.println("\nIdentidade secreta: ");
                    heroi.nome = sc.nextLine();

                    System.out.println("\nIdade: ");
                    heroi.idade = sc.nextInt();

                    System.out.println("\nPeso: ");
                    heroi.peso = sc.nextDouble();

                    System.out.println("\nTem poderes? (se Sim digite: true / se Não digite:  false)");
                    heroi.poderes = sc.nextBoolean();

                    listaDeHerois.add(heroi);
                    
                    break;
            
                case 2:
                    System.out.println("Teste");
                    break;
                
                case 3:
                    funcionamento = false;
                    break;

            }
        }
    }
    
}