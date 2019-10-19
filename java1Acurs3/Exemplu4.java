public class Exemplu4 {
    public static void main(String [] args) {
        int[] v1 = new int[4];
        int[] v2;
        v2 = new int[]{2, 7, -1};
        
        int[] v3 = {3, 5, 7};
        
        int[] w1;
        int w2[], w3;
        // w2 - array 1D
        // w3 - variabila
        
        int[] w4, w5[];
        // w4 - vector (1D)
        // w5 - matrice (2D)
        
        int m[][] = {{1, 2}, {3, 4}};
        
        System.out.println( suma(2, 3) );
        System.out.println( suma(3, 4, 5) );
        System.out.println( suma() );
        System.out.println( suma(new int[]{2, 3}) );
    }
    
    static int suma(int ... numere) {
        int[] nr = numere;
        
        int s = 0;
        
        for (int x : nr) {
            s += x;
        }
        
        return s;
    }
    
    
    
}