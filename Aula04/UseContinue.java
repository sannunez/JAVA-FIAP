public class UseContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i<5) {
            
            if (i == 2) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    
}
