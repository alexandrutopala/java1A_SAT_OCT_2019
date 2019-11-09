public class DBConnection implements AutoCloseable {
    public DBConnection() {
        System.out.println("Se deschide resursa...");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Exceptie la inchidere");
        //System.out.println("Se inchide resursa...");
    }
}