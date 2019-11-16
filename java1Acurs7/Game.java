import java.util.*;

public class Game {
    private static Game singleton;
    
    private int number;
    
    private Game() {
        init();
    }
    
    public static Game getInstance() {
        if (singleton == null) {
            singleton = new Game();
        }
        
        return singleton;
    }
    
    public boolean isGreaterThan(int x) {  
        return number > x;
    }
    
    public boolean isLessThan(int x) {
        return number < x;
    }
    
    public boolean isEqual(int x) {
        return number == x;
    }
    
    private void init() {
        Random r = new Random();
        number = r.nextInt(99) + 1;
        System.out.println("Ma gandesc la un nr. intre 1 si 99");
    }
    
    public void gameOver() {
        init();
    }
    
}