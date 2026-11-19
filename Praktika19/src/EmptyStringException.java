/**
 * Пользовательское исключение для пустой строки (по схеме Рис. 19.1).
 */
public class EmptyStringException extends Exception {
    public EmptyStringException(String errorMessage) {
        super(errorMessage);
    }
}
