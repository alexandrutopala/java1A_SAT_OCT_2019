import java.util.*;

public class Exemplu8 {
    public static void main(String [] args) {
        
        Comparator<Produs> comp = new Comparator<Produs>() {
            
            @Override
            public int compare(Produs p1, Produs p2) {
                return p1.getNume().compareTo(p2.getNume());   
            }
        };
        
        Comparator<Produs> comp2 = 
            (p1, p2) -> p1.getNume().compareTo(p2.getNume());
        
        Comparator<Produs> comp3 = 
            Comparator.comparing(Produs::getNume)
                      .thenComparing(Produs::getPret);
            
        // Produs::getNume -> produs -> produs.getNume()    
            
        Set<Produs> produse = new TreeSet<>(comp);
        
        produse.add( new Produs("cioco", 5) );
        produse.add( new Produs("bere", 4) );
        produse.add( new Produs("lapte", 5) );
        produse.add( new Produs("paine", 2) );
        
        System.out.println(produse);
    }
}