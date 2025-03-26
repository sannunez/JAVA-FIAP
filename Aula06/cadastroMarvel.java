import java.util.Scanner;
import java.util.ArrayList;

public class cadastroMarvel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true; 
        
        ArrayList<Herois> listaDeHerois = new ArrayList<>(); 
        ArrayList<Viloes> listaDeViloes = new ArrayList<>(); 

        System.out.println("Bem vindo ao cadastro de personagens da MARVEL");
        
        // SISTEMA DE CADASTRO
        while (continuar){
            System.out.println("0. Encerrar | 1. Cadastrar Herói | 2. Cadastrar Vilão");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    continuar = false;               
                    break;
                
                case 1:
                    Herois heroi = new Herois();
                    
                    System.out.print("\nNome do herói: ");
                    heroi.nomeDeHeroi = sc.next();
                    
                    System.out.print("Identidade secreta: ");
                    heroi.nome = sc.next();

                    System.out.print("Idade: ");
                    heroi.idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Peso: ");
                    heroi.peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Tem poderes? (Sim: true / Não: false): ");
                    heroi.poderes = sc.nextBoolean();

                    System.out.println("");

                    listaDeHerois.add(heroi);
                    break;

                case 2:
                    Viloes vilao = new Viloes();

                    System.out.print("\nNome do vilão: ");
                    vilao.nomeDeVilao = sc.next();
                    

                    System.out.print("Idade: ");
                    vilao.idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Peso: ");
                    vilao.peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Tem poderes? (Sim: true / Não: false): ");
                    vilao.poderes = sc.nextBoolean();

                    System.out.println("");

                    listaDeViloes.add(vilao);
                    break;
                    
                default:
                    break;
            }
        }
        
        
        // Exibindo listas de personagens cadastrados
        if (listaDeHerois.size() > 0) {
            System.out.println("\nLista de Heróis Cadastrados:");
            for (Herois heroi : listaDeHerois) {
                System.out.println(listaDeHerois.indexOf(heroi) + " | " + heroi.nomeDeHeroi);
            }
        } 

        if (listaDeViloes.size() > 0) {
            System.out.println("\nLista de Vilões Cadastrados:");
            for (Viloes vilao : listaDeViloes) {
                System.out.println(listaDeViloes + " | " + vilao.nomeDeVilao);
            }
        }
        
        // SISTEMA DE AÇÕES:
        System.out.print("\nDeseja realizar alguma ação? (Não: 0 / Sim: 1)");
        int realizarAcao = sc.nextInt();
        int agir;
        int personagemEscolhido;

        if (listaDeHerois.size() != 0 || listaDeViloes.size() !=0){
            while (realizarAcao == 1){
                System.out.print("Deseja utilizar um herói ou vilão? (0: Herói / 1: Vilão)");
                int escolha = sc.nextInt();
                
                if (escolha == 0) {
                    System.out.println("Você escolheu herói, qual deseja utilizar: ");
                    
                    for (Herois heroi : listaDeHerois) {
                        System.out.println(listaDeHerois.indexOf(heroi) + " | " + heroi.nomeDeHeroi);
                    }

                    System.out.println("Digite o número do herói desejado: ");
                    personagemEscolhido = sc.nextInt();

                    System.out.println("Herói escolhido: " + listaDeHerois.get(personagemEscolhido).nomeDeHeroi);
                    System.out.println("0. Exibir Atributos | 1. Lutar | 2. Salvar");
                    
                    agir = sc.nextInt();
    
                    switch (agir) {
                        case 0:
                            listaDeHerois.get(personagemEscolhido).exibirAtributos();
                            break;
                        
                        case 1:
    
                            break;
                            
                        case 2:
    
                            break;

                        default:
                            break;
                    }
                }
    
                if (escolha == 1) {
                    System.out.println("Você escolheu vilão");
                }
                realizarAcao = 0;
            }
        } else {
            System.out.println("Não há personagens cadastrados!");
        }
        
        
        
        sc.close();
    }
    
}