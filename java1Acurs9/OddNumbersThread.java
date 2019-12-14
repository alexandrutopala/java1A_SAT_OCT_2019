public class OddNumbersThread extends Thread {
    
    @Override
    public void run() {
        
        
        for (int i = 1; i <= 25; i += 2) {
            System.out.println(i);
            
            try {
                // pun firul curent in zona Wait timp de
                // 25 de milisecunde
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}