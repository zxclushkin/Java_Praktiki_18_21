/**
 * Задание 1 (Практическая работа № 19).
 * Проверяемое пользовательское исключение BadFileNameException (extends Exception).
 */
public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 1. Проверяемое исключение BadFileNameException ===");
        testFileName("notes.txt");
        testFileName("bad?name.txt");
    }

    private static void testFileName(String fileName) {
        try {
            checkFileName(fileName);
            System.out.println("Имя файла корректно: " + fileName);
        } catch (BadFileNameException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

    public static void checkFileName(String fileName) throws BadFileNameException {
        if (fileName == null || fileName.trim().isEmpty()
                || fileName.contains("?") || fileName.contains("*")) {
            throw new BadFileNameException("Bad filename: " + fileName);
        }
    }
}
