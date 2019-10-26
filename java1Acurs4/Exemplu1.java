public class Exemplu1 {
    public static void main(String [] args) {
        Animal a1 = new Animal("Max", 5);
        
        //a1.nume = null;
        
        System.out.println(a1.getNume());
        
        Domestic d1 = new Domestic(true);
        
        d1.setNume("Rex");
    }
}