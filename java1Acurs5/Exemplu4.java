public class Exemplu4 {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Gigel", 2);
        Angajat a2 = new Angajat("Florica", 3);
        Angajat a3 = new Angajat("Costel", 1) {
            
            @Override
            public int getSalariu() {
                return 4000;
            }
        };
        
        System.out.println(a1.getSalariu());
        System.out.println(a2.getSalariu());
        System.out.println(a3.getSalariu());
        
    }
}