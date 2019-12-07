import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        
        Set<String> set = new LinkedHashSet<>();
        
        set.add("bucuresti");
        set.add("iasi");
        set.add("sibiu");
        set.add("iasi");
        set.add("brasov");
        
        System.out.println(set);
    }
} 