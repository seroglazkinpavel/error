package seminar_3.exceptions;

public class ArrayException extends RuntimeException {
    public ArrayException() {
        super("Массив данных равен нулю.");
    }
}