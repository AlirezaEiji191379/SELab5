package Exceptions;

public class InvalidLengthException extends Exception {
    public InvalidLengthException() {
    }

    public InvalidLengthException(String message) {
        super(message);
    }
}
