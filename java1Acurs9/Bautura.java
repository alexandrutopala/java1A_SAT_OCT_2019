public abstract class Bautura {
    String nume;
    
    int pret;
    
    Bautura(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
}