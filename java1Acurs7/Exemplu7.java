import java.util.*;

public class Exemplu7 {
    public static void main(String [] args) {
        
        
        Random rand = new Random();
        
        int x = rand.nextInt(); // generam un int aleator
        System.out.println(x);
        
        int y = rand.nextInt(10); // [0, 10)
        System.out.println(y);
        
        int z = rand.nextInt(21) - 10;
        
    }
}