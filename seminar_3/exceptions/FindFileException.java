package seminar_3.exceptions;

import java.io.IOException;

public class FindFileException extends IOException {
    public FindFileException(String message) {
        super("Файл не найден: " + message);
    }
}