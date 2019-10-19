public class Exemplu2 {
    public static void main(String [] args) {
        int[] v;
        v = new int[3];
        
        
        v[1] = 7;
        v[0] = 2;
        v[2] = -1;
        
        System.out.println(v[0]);
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(i + " " + v[i]);
        }
        
        for (int x : v) {
            System.out.println(x);
        }
        
        
    }
}