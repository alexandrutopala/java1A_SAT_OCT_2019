public class Exemplu6 {
    public static void main(String [] args) {
        Pisica p1 = Pisica.getInstance();
        p1.nume = "Mitzi";
        
        
        Pisica p2 = Pisica.getInstance();
        p2.nume = "Tom";
        
        System.out.println(p1.nume);
    }
}