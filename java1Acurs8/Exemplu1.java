public class Exemplu1 {
    public static void main(String [] args) {
        Cutie c1 = new Cutie();
        
        
        Cutie<String> c2 = new Cutie<String>();
        // c2 poate primi o instanta de cutie care are
        // ca tip generic obligatoriu String (si nu altceva)
        
        
        //Cutie<CharSequence> c3 = new Cutie<String>();
        //new Cutie<int>();
        
        Cutie<?> c3 = new Cutie<int[]>();
        // c3 acepta o instanta de Cutie, indiferent de tipul
        // ei generic
        
        Cutie<? extends CharSequence> c4 = new Cutie<String>();
        // c4 primeste o instanta de Cutie care are ca tip
        // generic pe CharSequence, sau orice clasa care 
        // mosteneste pe CharSequence
        
        Cutie<? super CharSequence> c5 = new Cutie<Object>();
        // c5 primeste o instanta de Cutie care are ca tip
        // generic pe CharSequence, sau orice clasa 
        // superioara lui CharSequence
        
        Cutie<Integer> c6 = new Cutie<>();
        
        new Cutie<>(); // se subintelege Object
        
        Cutie<? extends CharSequence> c7 = new Cutie<>();
        // se subintelege CharSequence
        
        new Cutie< Cutie<String> >();
    }
}