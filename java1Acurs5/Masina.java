public class Masina {
    // singleton lazy sincronizat
    
    private Masina() {
    }
    
    
    private static final class SingletonHolder {
        public static final Masina SINGLETON = new Masina();
    }
    
    public static Masina getInstance() {
        return SingletonHolder.SINGLETON;
    }
}