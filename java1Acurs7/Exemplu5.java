public class Exemplu5 {
    public static void main(String [] args) {
        // boxing
        Integer i1 = 2;// new Integer(2);
        
        
        // unboxing
        int x = i1; //i1.intValue();
        
        m(x);
        
        // folosim Integer.parseInt pentru a transforma un sir 
        // de caractere la numarul aflat in acesta
        int y = Integer.parseInt("231");
        System.out.println(y);
    }
    
    private static void m(int x) {
        System.out.println("1");
    }
    
    private static void m(Integer x) {
        System.out.println("2");
    }
}