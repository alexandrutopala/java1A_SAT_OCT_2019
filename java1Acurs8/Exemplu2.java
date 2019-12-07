import java.util.*;

public class Exemplu2 {
    public static void main(String [] args) {
        
        List<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(3);
        
        System.out.println( list.size() );
        System.out.println( list.isEmpty() );
        System.out.println( list.contains(4) );
        System.out.println( list.get(1) ); 
        // list.get(1) <=> "list[1]"
        System.out.println("================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println( list.get(i) );
        }
        
        System.out.println("================");
        
        for (int x : list) {
            System.out.println(x);
        }
        
        System.out.println(list);
    }
}