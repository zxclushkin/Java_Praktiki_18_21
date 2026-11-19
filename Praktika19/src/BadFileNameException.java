/**
 * Проверяемое пользовательское исключение для некорректного имени файла.
 */
public class BadFileNameException extends Exception {
    public BadFileNameException(String errorMessage) {
        super(errorMessage);
    }

    public BadFileNameException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
