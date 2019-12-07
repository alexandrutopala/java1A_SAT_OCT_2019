import java.util.*;
import java.util.function.*;

public class Exemplu9 {
    public static void main(String [] args) {
        
        Map<String, Integer> map = new TreeMap<>();
        
        map.put("gigel", 1);
        map.put("costel", 2);
        map.put("maria", 3);
        map.put("florica", 6);
        
        Set<String> chei = map.keySet();
        Collection<Integer> valori = map.values();
        
        String cheie = "gigel";
        Integer valoare = map.get(cheie);
        
        System.out.println(cheie + " " + valoare);
        
        for (String key : chei) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        
        map.remove("gigel");
        
        map.put("costel", 4);
        
        System.out.println(map);
        
        Consumer<String> cons = s -> System.out.println(s);
        
        chei.forEach(cons);
        
        BiConsumer<String, Integer> cons2 = 
            (k, v) -> System.out.println(k + "=" + v);
            
        map.forEach(cons2);    
    }
}