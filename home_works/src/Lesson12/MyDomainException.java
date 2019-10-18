package Lesson12;

public class MyDomainException extends Exception {
    public MyDomainException() {
    }

    public MyDomainException(String message) {
        super(message);
    }

    public MyDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
