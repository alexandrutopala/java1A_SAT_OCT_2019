public class Exemplu4 {
    public static void main(String [] args) {
        int a = 3;
        
        int b = 4;
        
        if (a > b) {
            System.out.println("Hello");
        } else {
            System.out.println("in else");
        }
        
        System.out.println("End");
        
        int c = a > b ? 1 : 0;
        System.out.println(c);
        
    }
}