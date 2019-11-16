public class Exemplu6 {
    public static void main(String [] args) {
        Integer i = 3;
        Long l = 3L;
        
        // == poate fi pus doar intre instante ale aceleasi clase
        // System.out.println(i == l);
        
        // returneaza flase ptc sunt referinte ale unor clase diferite
        System.out.println(i.equals(l));
    }
}