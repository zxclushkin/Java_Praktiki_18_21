/**
 * Непроверяемое пользовательское исключение для файла без расширения.
 */
public class BadFileExtensionException extends RuntimeException {
    public BadFileExtensionException(String errorMessage) {
        super(errorMessage);
    }

    public BadFileExtensionException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
