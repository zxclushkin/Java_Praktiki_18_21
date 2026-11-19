/**
 * Задание 2 (Практическая работа № 19).
 * Непроверяемое пользовательское исключение BadFileExtensionException (extends RuntimeException).
 */
public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 2. Непроверяемое исключение BadFileExtensionException ===");
        testExtension("report.pdf");
        testExtension("readme");
    }

    private static void testExtension(String fileName) {
        try {
            String ext = getExtension(fileName);
            System.out.println("Файл '" + fileName + "', расширение: ." + ext);
        } catch (BadFileExtensionException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }

    public static String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex <= 0 || dotIndex == fileName.length() - 1) {
            throw new BadFileExtensionException("Filename does not contain extension: " + fileName);
        }
        return fileName.substring(dotIndex + 1);
    }
}
