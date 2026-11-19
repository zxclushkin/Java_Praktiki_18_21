/**
 * Задание 3 (Практическая работа № 18).
 * Генерация исключения оператором throw и его перехват в вызывающем методе.
 */
public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 3. Генерация исключения (throw) ===");
        printMessage("java");
        printMessage(null);
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Ошибка при получении данных: " + e.getMessage());
        }
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
