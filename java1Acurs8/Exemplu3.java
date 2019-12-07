import java.util.*;
import java.util.function.*;

public class Exemplu3 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(2);
        
        /*
        //list.remove(2); // [4, 2, 2]
        list.remove(new Integer(2)); // [4, 3, 2]
        
        System.out.println(list);
        
        // pentru a sterge toate elementele "2" din lista
        while (list.contains(2)) {
            list.remove(new Integer(2));
        }
        */
        Predicate<Integer> pred = x -> x == 2;
        
        list.removeIf(pred);
        
        System.out.println(list);
        
    }
}