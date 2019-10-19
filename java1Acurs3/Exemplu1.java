public class Exemplu1 {
    public static void main(String [] args) {
        Caine c1 = new Caine("Max");
        Caine c2 = new Caine("Rex");
        
        
        c1.ham();
        c2.ham();
        
        System.out.println(c1.count);
        System.out.println(c2.count);
        System.out.println(Caine.count);
    }
}