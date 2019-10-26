public class Pisica extends Domestic {
    // modificare de atribute
    // definirea unui atribut al carui coincide numele
    // altui atribut mostenit
    String nume;
    
    public Pisica() {
        super(true);
        System.out.println("c-tor Pisica");
        
        super.nume = "Mitzi";
        
        nume = "Rex";
    }
    
    public void showSuperNume() {
        System.out.println("super: " + super.nume);
    }
    
    public void showThisNume() {
        System.out.println("this: " + this.nume);
    }
    
    // adnotare care marcheaza faptul ca metoda adnotata
    // suprascrie o metoda mostenita
    @Override
    public void sayHello() {
        System.out.println("Miau! Numele meu este " + nume);
    }
    
    
    
    
    
    
    
    
}