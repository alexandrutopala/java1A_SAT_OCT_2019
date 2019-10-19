public class Exemplu3 {
    public static void main(String [] args) {
        int[][] m = new int[2][3];
        
        m[1][2] = 3;
        
        
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i + j;
            }
        }
        
        int v[] = new int[1];
        v[0] = -2;
        
        m[0] = v;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int x[] : m) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}


