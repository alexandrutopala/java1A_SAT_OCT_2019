public class Animal {
    protected String nume;
    private int varsta;
    
    
    
    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    public Animal() {
        System.out.println("c-tor Animal");
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public int getVarsta() {
        return varsta;
    }
    
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    
    public void sayHello() {
        System.out.println("Buna! Numele meu este " + nume);   
    }
    
    
    
    
    
    
}