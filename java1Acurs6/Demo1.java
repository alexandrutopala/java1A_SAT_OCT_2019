public class Demo1 {
    public static void main(String [] arg) {
        Pisica p = new Pisica("Mitzi");
        int x = 1;
        
        Foo f = new Foo();
        
        f.transRef(p);
        f.transVal(x);
        
        System.out.println(p.nume);
        System.out.println(x);
    }
}