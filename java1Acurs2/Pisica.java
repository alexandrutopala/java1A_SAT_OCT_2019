public class Pisica {
    String nume;
    String culoare;
    int greutate;
    
    Pisica() {
        this("un nume", "o culoare", 1);
        System.out.println("c-tor Pisica");
    }
    
    Pisica(String nume, String culoare, int greutate) {
        this.nume = nume;
        this.culoare = culoare;
        this.greutate = greutate;
    }
}