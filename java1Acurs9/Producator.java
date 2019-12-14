import java.util.*;

public class Producator extends Thread {
    
    public Producator(String nume) {
        super(nume);
    }
    
    @Override
    public void run() {
        Random r = new Random();
        
        while (true) {
            
            synchronized (Exemplu2.list) {
                if (Exemplu2.list.size() < 100) {
                    int x = r.nextInt(50);
                    Exemplu2.list.add(x);
                    System.out.println("PRODUS: " + x);
                    
                    Exemplu2.list.notifyAll();
                } else {
                    try {
                        Exemplu2.list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}