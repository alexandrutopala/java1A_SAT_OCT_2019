import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line;
        String[] input;
        Cafenea cafenea = Cafenea.getInstance();
        
        while (true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+");
                
                switch (input[0].toUpperCase()) {
                   case "ADD" : adauga(input); break;
                   case "AFIS" : cafenea.afiseazaBauturi(); break;
                   case "AFIS_CAFELE" : cafenea.afiseazaCafele(); break;
                   case "STERGE" : cafenea.stergeBautura(input[1]); break;
                   case "SORT" : cafenea.afiseazaSortat(); break;
                   case "EXIT" : System.exit(0);
                   default: System.err.println("Comanda invalida");
                }
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    private static void adauga(String [] input) {
        String tip = input[1];
        String nume = input[2];
        int pret = Integer.parseInt(input[3]);
        int inf = Integer.parseInt(input[4]);
        
        if (tip.equalsIgnoreCase("cafea")) {
            Cafea cafea = new Cafea(nume, pret, inf);
            Cafenea.getInstance().adaugaBautura(cafea);
        } else {
            Suc suc = new Suc(nume, pret, inf);
            Cafenea.getInstance().adaugaBautura(suc);
        }
    }
    
    
}