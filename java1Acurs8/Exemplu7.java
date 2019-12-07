import java.util.*;

public class Exemplu7 {
    public static void main(String [] args) {
        
        Set<String> set = new TreeSet<>();
        
        set.add("bucuresti");
        set.add("iasi");
        set.add("sibiu");
        set.add("iasi");
        set.add("brasov");
        
        System.out.println(set);
    }
} 