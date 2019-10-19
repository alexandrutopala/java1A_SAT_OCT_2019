public class Caine {
    String nume;
    static int count;
    
    
    
    static {
        // La incarea clasei in memorie
        // 1. se aloca spatiu pentru membri statici
        // 2. se executa blocurile anonime statice
        System.out.println("bloc anonim static");
    }
    
    {
        
        // bloc anonim non-static
        System.out.println("bloc anonim non-static");
        // la crearea unei instante:
        // 1. se aloca spatiu pentru atribute
        // 2. se executa blocurile anonime non-statice
        // 3. se executa c-torul
    }
    
    Caine(String nume) {
        
        count++;
        this.nume = nume;
        System.out.println("c-tor");
    }
    
    Caine() {
        this("Max");
    }
    
    void ham() {
        // context non-statica
        System.out.println("Ham! Numele meu este " + this.nume);
        System.out.println(count);
    }
    
    static void m() {
        // context static - putem folosi doar membri statici
        System.out.println("Hello");
        System.out.println(count);
        //System.out.println(this.nume); 
        // nu putem folosi membri non-statici in context static
    }
    
    
}