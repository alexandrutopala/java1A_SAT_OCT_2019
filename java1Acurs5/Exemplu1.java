public class Exemplu1 {
    public static void main(String [] args) {
        Personaj p1 = getPersonaj();
        p1.actioneaza();
    }
    
    
    
    private static Personaj getPersonaj() {
        return new Span();
    }
}