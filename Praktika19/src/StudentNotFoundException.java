/**
 * Пользовательское исключение, если студент не найден (по схеме Рис. 19.1).
 */
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
