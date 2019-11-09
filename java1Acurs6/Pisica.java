public class Pisica /*implicit */ extends Object {
    String nume;
    
    
    
    
    Pisica(String nume) {
        this.nume = nume;
    }
    
    @Override
    public boolean equals(Object other) {
        // daca parametrul este null, equals returneaza automat false
        if (other == null) {
            return false;
        }
        
        // daca parametrul primit nu e o instanta a clasei curente
        // (Pisica), equals returneaza automat false
        if (!(other instanceof Pisica)) {
            return false;
        }
        
        Pisica p = (Pisica) other;
        
        if (this.nume.equals(p.nume)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    @Override
    public int hashCode() {
        return this.nume.hashCode();
    }
    
    @Override
    public String toString() {
        return this.nume;
    }
    
}


