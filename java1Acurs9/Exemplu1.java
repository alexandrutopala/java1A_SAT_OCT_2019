public class Exemplu1 {
    public static void main(String [] args) throws Exception {
        OddNumbersThread t1 = new OddNumbersThread();
        EvenNumbersRunnable runnable = new EvenNumbersRunnable();
        Thread t2 = new Thread(runnable);
        
        // pornesc firul de executie
        t1.start();
        //t1.run();
        t2.start();
        
        // pune firul curent in WAIT pana la terminarea
        // firului t1
        t1.join();
        // pune firul curent in WAIT pana la terminarea
        // firului t2
        t2.join();
        
        System.out.println("End main");
    }
}