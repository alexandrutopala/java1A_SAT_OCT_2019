public class Exemplu5 {
    public static void main(String [] args) {
        
        
        
        
        
        Operatie o1 = new Operatie() {
            @Override
            public int calculeaza(int a, int b) {
                return a + b;
            }
        };
        
        Operatie o2 = (a, b) -> a + b;
        System.out.println( o2.calculeaza(2, 3) );
        
        Operatie o3 = (int a, int b) -> a + b;
        
        Operatie o4 = (a, b) -> {
            int c = a + b;
            return c;
        };
        
    }
}