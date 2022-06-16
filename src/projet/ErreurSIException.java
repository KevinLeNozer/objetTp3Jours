package projet;

public class ErreurSIException extends Exception{
    public ErreurSIException() {
    }

    public ErreurSIException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErreurSIException(String message) {
        super(message);
    }
}
