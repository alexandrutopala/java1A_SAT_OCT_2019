import java.util.*;

public class Cafenea {
    private static Cafenea singleton;
    
    private Map<String, Bautura> bauturi = new HashMap<>();
    
    private Cafenea() {
    }
    
    public static Cafenea getInstance() {
        if (singleton == null) {
            singleton = new Cafenea();
        }
        return singleton;
    }
    
    public void adaugaBautura(Bautura bautura) {
        if (bauturi.keySet().contains(bautura.nume)) {
            throw new NameAlreadyExistsException();
        }
        
        bauturi.put(bautura.nume, bautura);
    }
    
    public void afiseazaBauturi() {
        for (String key : bauturi.keySet()) {
            Bautura value = bauturi.get(key);
            System.out.println(value);
        }
    }
    
    public void afiseazaCafele() {
        for (String key : bauturi.keySet()) {
            Bautura value = bauturi.get(key);
            
            if (value instanceof Cafea) {
                System.out.println(value);
            }
        }
    }
    
    public void stergeBautura(String nume) {
        bauturi.remove(nume);
    }
    
    public void afiseazaSortat() {
        Collection<Bautura> values = bauturi.values();
        
        Comparator<Bautura> comp = (b1, b2) -> {
            if (b1.pret == b2.pret) {
                return b1.nume.compareTo(b2.nume);
            }
            
            return b1.pret - b2.pret;
        };
        
        Set<Bautura> set = new TreeSet<>(comp);
        
        set.addAll(values);
        
        System.out.println(set);
        
    }
    
}