public class Exemplu2 {
    public static void main(String [] args) {
        String s = "hello";
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.delete(1, 3);
        
        String rez = sb.toString();
        
        System.out.println(rez);
    }
}