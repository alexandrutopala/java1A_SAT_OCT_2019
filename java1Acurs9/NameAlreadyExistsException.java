public class NameAlreadyExistsException extends RuntimeException {
    public NameAlreadyExistsException() {
        super("Numele exista deja");
    }
}