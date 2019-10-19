public class Exemplu6 {
    public static void main(String [] args) {
        Cerc c = new Cerc( new Punct(5, 5), 2 );
        Punct a = new Punct(3, 2);
        Punct b = new Punct(4, 4);
        
        System.out.println(c.getArie());
        System.out.println(c.isInside(a));
        System.out.println(c.isInside(b));
    }
}