package unsw.expect;

public class ExpectationFailedException extends RuntimeException {
    public ExpectationFailedException(String message) {
        super(message);
    }
}
