import java.util.*;

public class Exemplu2 {
    public static List<Integer> list = new ArrayList<>();
    
    
    public static void main(String [] args) {
        new Producator("prod-1").start();
        new Producator("prod-2").start();
        new Producator("prod-3").start();
        
        new Consumator("cons-1").start();
        new Consumator("cons-2").start();
        new Consumator("cons-3").start();
    }
} 