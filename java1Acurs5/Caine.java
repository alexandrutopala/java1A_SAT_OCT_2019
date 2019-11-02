public class Caine {
    // singleton eager sincronizat
    private static Caine singleton = new Caine();
    
    private Caine() {
    }
    
    public static Caine getInstance() {
        return singleton;
    }
}