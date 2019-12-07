import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(4);
        list.addLast(10);
        list.addLast(5);
        list.removeFirst();
        list.addFirst(1);
        list.removeLast();
        list.addFirst(3);
        list.addLast(0);
        list.addFirst(7);
        list.addLast(16);
        list.removeFirst();
        
        System.out.println(list);
    }
}