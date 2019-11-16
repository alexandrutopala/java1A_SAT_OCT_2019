import java.util.*;

public class Main {
    public static void main(String [] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        Game game = Game.getInstance();
        
        while (true) {
            line = scanner.nextLine();
            input = line.split(" ");
            
            switch (input[0].toUpperCase()) {
                case "GT" :
                    
                    int x1 = Integer.parseInt(input[1]);
                    boolean rez1 = game.isGreaterThan(x1);
                    System.out.println(rez1);
                    break;
                case "LT" : 
                    int x2 = Integer.parseInt(input[1]);
                    boolean rez2 = game.isLessThan(x2);
                    System.out.println(rez2);
                    break;
                case "EQ" :
                    int x3 = Integer.parseInt(input[1]);
                    boolean rez3 = game.isEqual(x3);
                    System.out.println(rez3);
                    break;
                case "RESET" : 
                    game.gameOver();
                    break;
                case "EXIT" :
                    System.exit(0);
                    break;
                default : System.err.println("Comanda invalida");
            }
        }
        
        
        
    }
}