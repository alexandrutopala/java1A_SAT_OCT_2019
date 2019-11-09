public class Exemplu1 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica("Tom");
        Pisica p2 = new Pisica("Mitzi");
        Pisica p3 = new Pisica("Tom");
        Pisica p4 = p1;
        
        
        System.out.println(p1.equals(p2)); //false
        System.out.println(p1.equals(p3)); //true
        System.out.println(p1.equals(null)); // false
        System.out.println(p1 == p3); // false? 
        System.out.println(p1 == p4); // true? 
        
        System.out.println(p1);
    }
}