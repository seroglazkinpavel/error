package seminar_3.exceptions;

public class СhildFileCreateException extends FileCreateException {
    public СhildFileCreateException(String message) {
        super("Can't create file in CFileCreator: " + message);// Не удается создать файл в FileCreator:
    }
}