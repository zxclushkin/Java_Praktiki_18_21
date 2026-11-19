import java.util.Scanner;

/**
 * Задание 4 (Практическая работа № 18).
 * Проброс проверяемого исключения через throws и повторный ввод в цикле.
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
    }

    public static void run(Scanner scanner) {
        System.out.println("=== Задание 4. Проброс исключения (throws) и повторный ввод ===");
        getKey(scanner);
    }

    public static void getKey(Scanner scanner) {
        while (true) {
            System.out.print("Введите ключ (пустая строка вызовет исключение): ");
            String key = scanner.nextLine().trim();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage() + " Попробуйте еще раз.");
            }
        }
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) throws Exception {
        if (key == null || key.isEmpty()) {
            throw new Exception("Key set to empty string!");
        }
        return "data for " + key;
    }
}
