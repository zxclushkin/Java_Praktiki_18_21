/**
 * Задание 1 (Практическая работа № 18).
 * Деление на ноль и обработка ArithmeticException через try-catch.
 */
public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 1. Деление на ноль (try-catch) ===");

        // Деление вещественных чисел на ноль дает Infinity и не бросает исключение
        double doubleResult = 2.0 / 0.0;
        System.out.println("Результат 2.0 / 0.0 = " + doubleResult);

        // Целочисленное деление на ноль вызывает ArithmeticException
        try {
            int intResult = 2 / 0;
            System.out.println("Результат 2 / 0 = " + intResult);
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: Attempted division by zero (" + e.getMessage() + ")");
        }
    }
}
