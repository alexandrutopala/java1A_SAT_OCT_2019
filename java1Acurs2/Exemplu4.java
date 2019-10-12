public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p1;
        p1 = new Pisica();
        
        
        p1.nume = "Garfield";
        p1.culoare = "portocaliu";
        p1.greutate = 15;
        
        System.out.println(p1.nume);
        
        Pisica p2 = p1;
        
        p2.nume = "Ion";
        
        System.out.println(p1.nume);
        
        Pisica p3 = new Pisica();
        
        p3.nume = "Mitzi";
        
        System.out.println(p1.nume);
        System.out.println(p3.nume);
        
        //p2 = null;
        System.out.println(p2.nume);
        
    }
}