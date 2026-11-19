/**
 * Задание 1 (Практическая работа № 20).
 * Обобщенный класс с тремя параметрами (T, V, K), геттерами и выводом имен классов.
 */
public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 1. Обобщенный класс Triple<T, V, K> ===");

        Triple<String, Integer, Double> triple = new Triple<>("Java", 20, 9.5);
        System.out.println("Значения: " + triple.getFirst() + ", "
                + triple.getSecond() + ", " + triple.getThird());
        triple.printClassNames();
    }
}
