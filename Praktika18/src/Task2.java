import java.util.Scanner;

/**
 * Задание 2 (Практическая работа № 18).
 * Ввод целого числа, несколько блоков catch (частные и общий Exception) и блок finally.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
    }

    public static void run(Scanner scanner) {
        System.out.println("=== Задание 2. Блоки try-catch-finally ===");
        System.out.print("Введите целое число (для проверки попробуйте Qwerty, 0, 1.2 или 1): ");
        String input = scanner.nextLine().trim();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Результат 2 / " + number + " = " + (2 / number));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: '" + input + "' не является целым числом.");
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка: деление на ноль запрещено.");
        } catch (Exception e) {
            // Общий catch всегда ставится после более конкретных исключений
            System.out.println("Общее исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: выполняется всегда после try/catch.");
        }
    }
}
