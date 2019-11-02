public class Pisica {
    // singleton lazy nesincronizat
    private static Pisica singleton;
    
    String nume;
    
    private Pisica() {
    }
    
    public static Pisica getInstance() {
        if (singleton == null) {
            singleton = new Pisica();
        }
        
        return singleton;
    }
    
}