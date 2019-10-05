/**
 * Acesta e un comentariu de documentatie
 * @link
 * @return
 */
public class Exemplu5 {
    
    /* 
       Acesta este un comentariu
       pe mai multe linii
       care descrie metoda main
       */
    public static void main(String [] args) {
        int a = 4, b = 4, c = 3;
        
        
        int max = a > b ? a : b; // acesta este un comentariu
        max = max > c ? max : c; 
        
        System.out.println(max);
    }
}