import java.util.Scanner;

// METODO DO PROFESSOR
public class primeultimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int primeiro = 0;
        int ultimo = 0;
        boolean primeiroDigitado = false;


        System.out.println("Digite vários números inteiros (0 para sair) : ");

        while (true){
            numero = sc.nextInt();

            if (numero == 0){
                break;
            } 

            if(!primeiroDigitado) {
                primeiro = numero;
                primeiroDigitado = true;
            }
            ultimo = numero;

        }
        if (primeiroDigitado){
            System.out.println(("1º numero digitado: " + primeiro));
            System.out.println("Último número digitado: " + ultimo);
        } else {
            System.out.println("Nenhum número digitado.");
        }

      
    }
}

// MEU METODO

// import java.util.Scanner;

// public class primeultimo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Digite um número: ");
//         int primeNum = sc.nextInt();
//         int ultiNum = primeNum;

//         sc.nextLine(); //consumir quebra de linha pendente do nextInt

//         System.out.println("Continuar? Digite 'NAO' para interromper ");
//         String continuar = sc.nextLine();
        
//         do{
//             System.out.println("Ultimo numero: ");
//             ultiNum = sc.nextInt();
            
//             sc.nextLine(); //consumir quebra de linha pendente do nextInt

//             System.out.println("Continuar? Digite 'NAO' para interromper ");
//             continuar = sc.nextLine();
//         } while (!"NAO".equalsIgnoreCase(continuar));
//         sc.close();

//         System.out.println("O primeiro número foi: " + primeNum + "\nO ultimo número foi: " + ultiNum);
//     }
// }