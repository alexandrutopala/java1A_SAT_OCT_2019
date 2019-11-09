// pentru a defini o exceptie unchecked sau de run-time
// mostenim RuntimeException
public class MyRuntimeException extends RuntimeException {
    MyRuntimeException() {
        super("Aceasta este exceptia mea unchecked");
    }
}