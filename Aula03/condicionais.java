
public class condicionais {
    public static void main(String[] args) {
        // IF SIMPLES
        if (20> 10){
            System.out.println("20 é maior que 10");
        }

        // IF SIMPLES COM VARIAVEIS
        int x = 20;
        int y = 18;
        if (x > y){
            System.out.println("x é maior que y");
        }

        // ELSE
        int time = 20;
        if (time < 18){
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa noite");
        }

        // ELSE IF
        int horario = 12;
        if (horario < 18){
            System.out.println("Good Afternoon");
        } else if (horario < 12){
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Night.");
        }

        // OPERADOR TERNÁRIO
        int hour = 20;
        String result = (hour < 18) ?  "Good Morning." : " Good Evening";
        System.out.println(result);

        // INSTRUÇÕES ANINHADAS
        int tempo = 20;
        if (tempo < 0 || tempo >= 24){
            if (tempo <0) {
                System.out.print("Erro: A hora deve ser maior que 0");                
            }
            else {
                System.out.print("Erro: A hora deve ser menor que 24");
            }
        } 
        else {
            if (tempo <= 12) {
                System.out.print(tempo + "AM");
            }
            else {
                System.out.print(tempo - 12 + "PM");
            }
            System.out.println(" é o mesmo que" + tempo + "horas.");
        }

        // SWITCH CASE
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
              
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
