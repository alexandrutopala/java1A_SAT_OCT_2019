public class Exemplu5 {
    public static void main(String [] args) {
        Foo f1 = new Foo();
        
        
        
        f1.hello();
        f1.hello();
        f1.hello();
        
        int c = f1.suma(2, 1);
        System.out.println(c);
        System.out.println(f1.suma(3, 6));
        
        //f1.m(null);
        
        Pisica p1 = new Pisica();
        p1.nume = "Mitzi";
        
        int x = 2;
        
        f1.transferCopie(x);
        f1.transferRef(p1);
        
        System.out.println(x);
        System.out.println(p1.nume);
        
        
    }
}