package seminar_3.exceptions;

import java.io.IOException;

public class ConsoleException extends IOException {
    public ConsoleException(IOException message) {
        super("Исключение при чтении с консоли: " + message.getMessage());
    }
}