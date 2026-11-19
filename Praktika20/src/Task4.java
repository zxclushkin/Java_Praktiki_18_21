/**
 * Задание 4 (Практическая работа № 20).
 * Необобщенный класс Calculator с обобщенными статическими методами.
 */
public class Task4 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 4. Обобщенные методы класса Calculator ===");

        Integer a = 10;
        Double b = 2.5;

        System.out.println("Числа: a = " + a + " (Integer), b = " + b + " (Double)");
        System.out.println("Сумма:        " + Calculator.sum(a, b));
        System.out.println("Вычитание:    " + Calculator.subtraction(a, b));
        System.out.println("Умножение:    " + Calculator.multiply(a, b));
        System.out.println("Деление:      " + Calculator.divide(a, b));
    }
}
