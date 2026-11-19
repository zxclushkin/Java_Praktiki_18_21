/**
 * Пользовательское исключение для недействительного ИНН.
 */
public class InvalidInnException extends Exception {
    public InvalidInnException(String errorMessage) {
        super(errorMessage);
    }
}
