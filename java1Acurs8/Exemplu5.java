import java.util.*;

public class Exemplu5 {
    public static void main(String [] args) {
        
        Set<String> set = new HashSet<>();
        
        set.add("bucuresti");
        set.add("iasi");
        set.add("sibiu");
        set.add("iasi");
        set.add("brasov");
        
        System.out.println(set);
    }
} 