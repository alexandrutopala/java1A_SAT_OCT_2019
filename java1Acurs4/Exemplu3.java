public class Exemplu3 {
    public static void main(String [] args) {
        // instanta de pisica in forma de pisica
        Pisica p1 = new Pisica(); 
        
        // instanta de pisica in forma de domestic
        Domestic d1 = new Pisica();
        
        // instanta de domestic in forma de animal
        Animal a1 = new Domestic(false);
        
        // instanta de pisica in forma de animal
        Animal a2 = new Pisica();
        
        // am folosit cast-ul pentru a garanta compilatorului
        // ca in forma Domestic d1 se afla o instanta de Pisica
        Pisica p2 = (Pisica) d1;
        
        // verificam daca in a1 se afla o instanta a clasei 
        // Pisica, sau a altei clase care mosteneste clasa
        // Pisica
        if (a1 instanceof Pisica) {
            Pisica p3 = (Pisica) a1;
        } else {
            System.out.println("Nu e o instanta de Pisica");
        }
        
        a2.setNume("Tommy");
        // Putem apela doar membri definiti in forma lui a2,
        // adica cei definiti in clasa Animal
        //a2.isDeInterior();
        
        a2.sayHello();
        
        //String s1 = new Pisica();
    }
}