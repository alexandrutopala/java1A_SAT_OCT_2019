public enum Anotimp {
    PRIMAVARA(1), IARNA(4), VARA(10), TOAMNA(23);
    // public static final Anotimp IARNA = new Anotimp(4);
    
    int x;
    
    
    Anotimp(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
}