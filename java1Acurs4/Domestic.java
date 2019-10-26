public class Domestic extends Animal {
    // particularizare prin adaugare de atribute
    private boolean deInterior;
    
    
    
    public Domestic(boolean deInterior) {
        this.deInterior = deInterior;
        System.out.println("c-tor Domestic");
    }
    
    // particularizare prin adaugare de comportamente
    public boolean isDeInterior() {
        return deInterior;
    }
    
    public void setDeInterior(boolean deInterior) {
        this.deInterior = deInterior;
    }
}