@FunctionalInterface
public interface InstrumentCuCorzi extends Instrument, ObiectDeLemn {
    @Override
    default void canta() {
        System.out.println("La lala");
    }
    
    static void m() {
        System.out.println("Metoda statica");
    }
}