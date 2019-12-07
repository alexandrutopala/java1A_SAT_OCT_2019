public class Produs implements Comparable<Produs> {
    private String nume;
    private int pret;
    
    
    public Produs(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getPret() {
        return this.pret;
    }
    
    public void setPret(int pret) {
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
    
    // prin metoda compareTo, definim relatie de ordine
    // intre doua obiecte ale aceleasi clase
    @Override
    public int compareTo(Produs other) {
        return this.pret - other.pret;
    }
    
    
    
}