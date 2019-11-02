public class Exemplu2 {
    public static void main(String [] args) {
        Anotimp a1 = Anotimp.VARA;
        
        
        
        switch (a1) {
            case IARNA : System.out.println("E frig"); break;
            case PRIMAVARA : System.out.println("E caldut"); break;
            case VARA : System.out.println("E cald"); break;
            case TOAMNA : System.out.println("E frigut"); break;
        }
        
        Anotimp[] anotimpuri = Anotimp.values();
        
        for (Anotimp a : anotimpuri) {
            System.out.println(a.ordinal() + " " + a.name());
        }
        
        Anotimp iarna = Anotimp.valueOf("IARNA");
        System.out.println(iarna.getX());
        
        System.out.println(Anotimp.IARNA.getX());
        
    }
}





