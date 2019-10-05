public class Exemplu3 {
    public static void main(String [] args) {
        int s = 2 + 2;
        
        int x = 3;
        byte y = 2;
        
        int s2 = x * y;
        System.out.println(s2);
        
        boolean b1 = x > y;
        System.out.println(x != 2);
        System.out.println(4 == 5);
        
        
        boolean b3 = true || false;
        boolean b4 = b3 && 3 > 2 + 1;
        boolean b5 = !b4;
        
        int a = 5;
        int b = 2;
        
        b += a;
        System.out.println(b);
        
        b *= 3 + 2;
        System.out.println(b);
        
        b++;
        System.out.println(b--);
        System.out.println(b);
        
        int c = 4;
        int d = c++ + ++c + --c * 2 + 3;
        
        System.out.println(d);
        System.out.println(c);
    }
}


