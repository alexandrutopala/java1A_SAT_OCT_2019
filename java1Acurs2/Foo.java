public class Foo {
    
    
    
    
    
    
    
    
    void hello() {
        if (1 == 1) {
            return;
        }
        System.out.println("Hello world");
    }
    
    int suma(int a, int b) {
        int c = a + b;
        
        if (1 == 1) {
            return c;
        }
        
        int x = 1;
        return x;
    }
    
    void m(long x) {
        System.out.println("1");
    }
    
    void m(int x) {
        System.out.println("2");
    }
    
    void m(Pisica x) {
        System.out.println("3");
    }
    
    void m(String x) {
        System.out.println("4");
    }
    
    void transferCopie(int x) {
        x++;
    }
    
    void transferRef(Pisica p) {
        p.nume = "Tom";
    }
    
    
    
    
    
}