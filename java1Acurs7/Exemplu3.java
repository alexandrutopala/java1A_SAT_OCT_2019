public class Exemplu3 {
    public static void main(String [] args) {
        String s = "ana are mere";
        
        // EREM99ERA99ANA
        
        s = s.replace(" ", "99");
        s = s.toUpperCase();
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        
        String rez = sb.toString();
        
        System.out.println(rez);
        
    }
}