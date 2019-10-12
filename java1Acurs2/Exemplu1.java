public class Exemplu1 {
    public static void main(String [] args) {
        int n = 5;
        
        while (n < 5) {
            if (n == 2) {
                n++;
                continue;
            }
            
            if (n == 4) {
                break;
            }
            
            System.out.println(n);
            n++;
        }
    }
}